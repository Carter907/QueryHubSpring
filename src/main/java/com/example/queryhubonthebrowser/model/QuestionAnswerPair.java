package com.example.queryhubonthebrowser.model;

import com.google.gson.GsonBuilder;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.aspectj.weaver.patterns.TypePatternQuestions;

@Embeddable
public class QuestionAnswerPair {
    private String question;
    private String answer;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    public QuestionAnswerPair() {}

    public QuestionAnswerPair(String question, String answer, Difficulty difficulty) {
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
