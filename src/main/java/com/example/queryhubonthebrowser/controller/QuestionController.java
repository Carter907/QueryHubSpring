package com.example.queryhubonthebrowser.controller;

import com.example.queryhubonthebrowser.model.Difficulty;
import com.example.queryhubonthebrowser.model.QuestionAnswerPair;
import com.example.queryhubonthebrowser.model.Quiz;
import com.example.queryhubonthebrowser.repository.QuizJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("quizzes/update")
public class QuestionController {

    private QuizJpaRepository repository;

    @Autowired
    public QuestionController(QuizJpaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/{id}")
    public Quiz putNewQuestion(@PathVariable Long id) {
        Quiz quiz = repository.findById(id).orElseThrow();
        quiz.getQuestions().add(new QuestionAnswerPair("WHat did anyone ever tell?", "Your mom's a hoe", Difficulty.IMPOSSIBLE));

        repository.save(quiz);
        return quiz;
    }

}
