package API;

import Database.DatabaseMan;
import org.bson.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ArticleApi {
    @PostMapping("/api/savearticle")
    public ResponseEntity<?> saveArticle(HttpServletRequest request) {
        String title = null, content = null, catalog = null;
        Map<String, String[]> map = request.getParameterMap();
        if (map.containsKey("title")) {
            title = map.get("title")[0];
        }
        if (map.containsKey("content")) {
            content = map.get("content")[0];
        }
        if (map.containsKey("catalog")) {
            catalog = map.get("catalog")[0];
        }

        Document document = new Document("title", title)
                .append("content", content)
                .append("catalog", catalog);
        DatabaseMan.Instance().GetCollection("article").insertOne(document);

        return ResponseEntity.ok("ok");
    }
}
