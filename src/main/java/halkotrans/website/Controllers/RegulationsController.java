package halkotrans.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegulationsController {

    @RequestMapping(path="/regulations")
    public String regulations(Model model){
        return "regulations";
    }

}
