package com.example.queryhubonthebrowser;

import com.example.queryhubonthebrowser.model.Difficulty;
import com.example.queryhubonthebrowser.model.QuestionAnswerPair;
import com.example.queryhubonthebrowser.model.Quiz;
import com.example.queryhubonthebrowser.repository.QuizJpaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class QueryHubOnTheBrowserApplication {

    private QuizJpaRepository repository;

    @Autowired
    public QueryHubOnTheBrowserApplication(QuizJpaRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(QueryHubOnTheBrowserApplication.class, args);
    }


}
