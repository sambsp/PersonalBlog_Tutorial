package API;

import Model.Article;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ArticleApi {
    @PostMapping("/api/savearticle")
    public ResponseEntity<?> saveArticle(@Valid @RequestBody Article article) {
        return ResponseEntity.ok("ok");
    }
}
