package com.example.queryhubinthebrowerkotlins.controllers

import com.example.queryhubinthebrowerkotlins.model.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.server.ResponseStatusException
import java.util.function.Supplier

@Controller
@RequestMapping("/test")
class TestController(
    @Autowired
    var service: QuestionService
) {
    @GetMapping("/{id}") fun testById(@PathVariable id: Long, model: Model): String {
        model.addAttribute("question", service.findById(id)
            .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND, "could not find question") }
        )

        return "test"
    }
    @GetMapping fun testPage(model: Model): String =
        if (service.findFirstId() == null)
        { throw ResponseStatusException(HttpStatus.NOT_FOUND, "no questions in test") }
        else { "redirect:/test/${service.findFirstId()}" }



}