package com.example.edustaz.data.model

data class Question(
    val text: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)

