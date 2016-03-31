package com.github.stuartblair;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/signin")
public class SigninController {

    public SigninController() {
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public String signin(Model model) {
        return "signin";
    }
}
