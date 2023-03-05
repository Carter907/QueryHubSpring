package com.example.queryhubonthebrowser.repository;

import com.example.queryhubonthebrowser.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizJpaRepository extends JpaRepository<Quiz, Long> {
    // id is second because it isn't besint

}
