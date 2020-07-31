package API;

import DefaultMain.Database.ArticleRepository;
import Model.Article;
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
    private ArticleRepository articleRepository;

    @PostMapping("/api/savearticle")
    public ResponseEntity<?> saveArticle(@Valid @RequestBody Article article) {
        Article dbArticle = articleRepository.save(article);
        if (dbArticle == null) {
            return ResponseEntity.badRequest().build();
        }
        else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(dbArticle.getTitle())
                    .toUri();

            return ResponseEntity.created(uri)
                    .body(dbArticle);
        }
    }
}
