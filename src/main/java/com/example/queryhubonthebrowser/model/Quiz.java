package com.example.queryhubonthebrowser.model;

import jakarta.persistence.*;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "quiz_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "difficulty")
    private Difficulty difficulty;
    @ElementCollection
    @CollectionTable(name = "questions", joinColumns = @JoinColumn(name = "quiz_id"))
    private List<QuestionAnswerPair> questions;

    public Quiz(String name, Difficulty difficulty, List<QuestionAnswerPair> questions) {
        this.name = name;
        this.difficulty = difficulty;
        this.questions = questions;
    }
    public Quiz() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public List<QuestionAnswerPair> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionAnswerPair> questions) {
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
