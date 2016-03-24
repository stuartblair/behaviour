package com.github.stuartblair;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/behaviour")
public class BehaviourController {

    private List<String> children;

    public BehaviourController() {
        children = new ArrayList<String>();
        children.add("Struan");
        children.add("Lachlan");
    }

    @RequestMapping(method=RequestMethod.GET)
    public String allBehaviour(Model model) {
        model.addAttribute("children", children);
        return "behaviour/behaviours";
    }
}
