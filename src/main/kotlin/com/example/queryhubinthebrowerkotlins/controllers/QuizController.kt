package com.example.queryhubinthebrowerkotlins.controllers

import com.example.queryhubinthebrowerkotlins.model.Question
import com.example.queryhubinthebrowerkotlins.model.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/all")
class QuizController(
    @Autowired
    var service: QuestionService
) {
    @GetMapping fun allQuestions(): List<Question> = service.findAll();
}