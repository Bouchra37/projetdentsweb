package ma.projet.dents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/app/dent")
public class DentController {
    @GetMapping
    public String showMainPage(Model model) {
        return "drowdent";
    }
}
