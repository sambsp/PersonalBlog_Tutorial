package DefaultMain.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NewArticleController {
    @GetMapping("/newarticle")
    public String newArticle(HttpServletRequest request, ModelMap modelMap) {
        return "newArticle";
    }
}
