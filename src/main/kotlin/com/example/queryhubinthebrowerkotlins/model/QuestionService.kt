package com.example.queryhubinthebrowerkotlins.model

import com.example.queryhubinthebrowerkotlins.repository.QuestionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*


@Service
class QuestionService(
    @Autowired
    var repo: QuestionRepository
) {
    fun save(question: Question) = repo.save(question);
    fun findAll(): List<Question> = repo.findAll();
    fun findById(id: Long): Optional<Question> = repo.findById(id)
    fun findFirstId(): String? = if (repo.findAll().isEmpty()) { null } else { "${repo.findAll().get(0).id}"}
}

