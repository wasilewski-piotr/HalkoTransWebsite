package halkotrans.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @RequestMapping(path="/contact")
    public String contact(Model model){
        return "contact";
    }

}
