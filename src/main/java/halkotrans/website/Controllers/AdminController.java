package halkotrans.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping(path="/admin")
    public String admin(Model model){
        return "admin";
    }

}
