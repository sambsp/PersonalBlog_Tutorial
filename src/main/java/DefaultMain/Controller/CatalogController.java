package DefaultMain.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CatalogController {
    @GetMapping("/catalog")
    public String editCatalog(HttpServletRequest request, ModelMap modelMap) {
        return "editCatalog";
    }
}
