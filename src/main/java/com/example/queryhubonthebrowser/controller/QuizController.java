package com.example.queryhubonthebrowser.controller;

import com.example.queryhubonthebrowser.model.Quiz;
import com.example.queryhubonthebrowser.repository.QuizJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/quizzes")
public class QuizController {

    QuizJpaRepository repository;
    @Autowired
    public QuizController(QuizJpaRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return repository.findAll();
    }
    @GetMapping("/result/{id}")
    public Quiz getQuizById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public void createQuiz(@RequestBody Quiz quiz) {
        repository.save(quiz);
    }
}
