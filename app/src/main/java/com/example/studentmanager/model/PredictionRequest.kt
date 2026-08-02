package com.example.studentmanager.model

data class PredictionRequest(
    val name: String,
    val attendance: Int,
    val gpa: Double
)
