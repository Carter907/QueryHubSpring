package com.example.queryhubonthebrowser.controller;

import com.example.queryhubonthebrowser.model.Difficulty;
import com.example.queryhubonthebrowser.model.Quiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String homePage(Model model) {
        model.addAttribute("quiz", new Quiz());
        model.addAttribute("difficulties", Difficulty.difficulties());
        return "home";
    }
}
