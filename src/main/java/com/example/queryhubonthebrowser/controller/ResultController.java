package com.example.queryhubonthebrowser.controller;

import com.example.queryhubonthebrowser.model.Quiz;
import com.example.queryhubonthebrowser.repository.QuizJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/quizzes/form")
public class ResultController {
    private QuizJpaRepository repository;

    @Autowired
    public ResultController (QuizJpaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/submit")
    public String submitQuiz(@ModelAttribute Quiz quiz) {
        repository.save(quiz);

        return "redirect:../../api/quizzes/result/"+quiz.getId();
    }


}
