package com.example.queryhubinthebrowerkotlins.repository

import com.example.queryhubinthebrowerkotlins.model.Question
import org.springframework.data.jpa.repository.JpaRepository

interface QuestionRepository : JpaRepository<Question, Long> {
}