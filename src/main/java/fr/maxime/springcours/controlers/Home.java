package fr.maxime.springcours.controlers;

import fr.maxime.springcours.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/home")
    public String showHome(Model model) {
        model.addAttribute("att1",2);
        return "index";
    }

    @RequestMapping(value = "/save")
    public String createUser() {
        return "";
    }
}
