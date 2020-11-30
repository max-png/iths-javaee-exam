package com.rune.max.ithsspringwebshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/start")
public class MainController {
    @Autowired // Get the bean
    private UserRepository userRepository;

    @PostMapping(path = "/add") // ONLY POST Requests
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        //Returns JSON or XML with all users
        return userRepository.findAll();
    }

}
