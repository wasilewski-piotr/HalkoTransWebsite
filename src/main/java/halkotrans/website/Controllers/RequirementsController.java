package halkotrans.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequirementsController {

    @RequestMapping(path="/requirements")
    public String requirements(Model model){
        return "requirements";
    }

}
