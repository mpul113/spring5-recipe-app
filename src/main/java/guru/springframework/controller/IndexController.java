package guru.springframework.controller;

import guru.springframework.service.RecipieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    private final RecipieService recipieService;

    @Autowired
    public IndexController(RecipieService recipieService) {
        this.recipieService = recipieService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipieService.getRecipie());

        System.out.println(recipieService.getRecipie());

        return "index";
    }
}
