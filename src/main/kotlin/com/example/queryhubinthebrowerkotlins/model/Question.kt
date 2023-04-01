package com.example.queryhubinthebrowerkotlins.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Question(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    @Column(nullable = false)
    var text: String,
    @Column(nullable = false)
    var answer: String

) {

    constructor() : this(0, "", "")


}