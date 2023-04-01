package com.example.queryhubinthebrowerkotlins.controllers

import com.example.queryhubinthebrowerkotlins.model.Question
import com.example.queryhubinthebrowerkotlins.model.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/create")
class QuizCreationController(
    @Autowired
    var service: QuestionService
) {

    @GetMapping fun homePage(model: Model): String {
        model.addAttribute("question", Question())
        model.addAttribute("all", service.findAll())
        return "quiz_create_page"
    }

    @PostMapping fun postQuestion(@ModelAttribute("question") question: Question): String {
        service.save(question);

        return "redirect:/create"
    }
}