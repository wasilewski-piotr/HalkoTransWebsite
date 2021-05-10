package halkotrans.website.Controllers;

import halkotrans.website.Models.Driver;
import halkotrans.website.Repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class DriversController {

    @Autowired
    private DriverRepository driverRepository;

    @RequestMapping(path="/drivers")
    public String drivers(Model model){
        Driver driver = new Driver();
        model.addAttribute("driver", driver);
        model.addAttribute("drivers", driverRepository.findAll());

        return "drivers";
    }

    @RequestMapping("/drivers/add/new")
    public String addDriver(Model model){
        Driver driver = new Driver();
        List<String> list_position = Arrays.asList("Kierowca", "Rekruter", "Zarząd", "Szef");

        model.addAttribute("driver", driver);
        model.addAttribute("list_position", list_position);

        return "add_driver";
    }

    @PostMapping("/drivers/add/succes")
    public String addedDriver(Driver driver, Model model){
        driverRepository.save(driver);

        model.addAttribute("driver", driverRepository.findAll());
        model.addAttribute("drivers", driverRepository.findAll());

        return "redirect:/drivers";
    }
    @PostMapping("/drivers/update/{id}")
    public String updateDriver(@PathVariable("id") long id, Driver driver, Model model){
        driver.setId(id);
        driverRepository.save(driver);

        model.addAttribute("driver", driverRepository.findAll());
        model.addAttribute("drivers", driverRepository.findAll());

        return "redirect:/drivers";
    }

    @GetMapping("/drivers/delete/{id}")
    public String deleteDriver(@PathVariable("id") long id, Model model){
        Driver driver = driverRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid driver id: " + id));

        driverRepository.delete(driver);
        model.addAttribute("drivers", driverRepository.findAll());
        return "redirect:/drivers";
    }

    @GetMapping("/drivers/edit/{id}")
    public String editDriver(@PathVariable("id") long id, Model model){
        Driver driver = driverRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid driver id: " + id));

        List<String> list_position = Arrays.asList("Kierowca", "Rekruter", "Zarząd", "Szef");

        model.addAttribute("list_position", list_position);
        model.addAttribute("driver", driver);
        model.addAttribute("drivers", driverRepository.findAll());
        return "edit_driver";
    }

}
