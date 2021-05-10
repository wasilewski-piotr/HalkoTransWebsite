package halkotrans.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {

    @RequestMapping(path="/about_us")
    public String about_us(Model model){
        return "about_us";
    }

}
