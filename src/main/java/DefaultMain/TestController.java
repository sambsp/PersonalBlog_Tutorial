package DefaultMain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test(HttpServletRequest request, ModelMap modelMap) {
        modelMap.put("siteName", "random");
        return "test";
    }
}