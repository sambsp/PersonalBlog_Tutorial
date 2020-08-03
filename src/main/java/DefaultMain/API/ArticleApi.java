package DefaultMain.API;

import DefaultMain.Model.Article;
import DefaultMain.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class ArticleApi {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/api/savearticle")
    public ResponseEntity<?> saveArticle(@Valid @RequestBody Article article) {
        Article archive = articleService.create(article);
        if (archive == null) {
            return ResponseEntity.badRequest().build();
        }
        else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(archive.getTitle())
                    .toUri();

            return ResponseEntity.created(uri)
                    .body(archive);
        }
    }
}
