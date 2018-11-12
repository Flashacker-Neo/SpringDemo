package fr.maxime.springcours.controlers;

import fr.maxime.springcours.database.UserRepository;
import fr.maxime.springcours.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/home")
    public String showHome(Model model) {
        model.addAttribute("att1",2);
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createUser(@RequestParam String firstname, String lastname) {
        this.userRepository.save(new User(firstname,lastname));
        return "redirect:";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user) {
        this.userRepository.save(user);
        return "redirect:";
    }
}
