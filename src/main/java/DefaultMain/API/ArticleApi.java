package DefaultMain.API;

import DefaultMain.Model.Article;
import DefaultMain.Model.ResponseMessage;
import DefaultMain.Model.Tag;
import DefaultMain.Service.ArticleService;
import DefaultMain.Service.TagService;
import DefaultMain.Utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class ArticleApi {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private TagService tagService;

    @PostMapping("/api/savearticle")
    public ResponseEntity<?> saveArticle(@Valid @RequestBody Article article) {
        article.setPublished(false);
        return writeArticle(article);
    }

    @PostMapping("/api/publisharticle")
    public ResponseEntity<?> publishArticle(@Valid @RequestBody Article article) {
        article.setPublished(true);
        return writeArticle(article);
    }

    private ResponseEntity<?> writeArticle(Article article) {
        Article archive;

        for (int i = 0; i < article.getTagList().size(); ++i) {
            String name = article.getTagList().get(i).getName();
            if (tagService.exists(name)) {
                //已经存在的tag，通过得到id绑定
                List<Tag> tags = tagService.findByName(name);
                article.getTagList().get(i).setId(tags.get(0).getId());
            }
            else {
                //还不存在的tag，需要先创建一个，然后再绑定
                Tag t = new Tag();
                t.setId(null);
                t.setName(name);
                t.setCreateTime(Utility.getNowTime());
                t = tagService.create(t);
                article.getTagList().get(i).setId(t.getId());
            }
        }

        if (article.getId().isEmpty()) {
            //MongoRepository的API决定了，只有id是null的时候，才会返回给数据库的id给我们
            article.setId(null);
            archive = articleService.create(article);
        }
        else {
            archive = articleService.update(article);
        }

        ResponseMessage message = new ResponseMessage();
        if (archive == null) {
            message.setCode(-1);
            message.setMessage("create or update article error.");
        }
        else {
            message.setCode(0);
            message.setMessage("success");
            message.setData(archive);
        }

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(message);
    }
}