package com.example.studentmanager.utils

object ValidationUtils {
    fun isValidName(name: String): Boolean {
        return name.isNotBlank()
    }

    fun isValidGrade(gpa: Double): Boolean {
        return gpa in 0.0..4.0
    }

    fun isValidAttendance(attendance: Int): Boolean {
        return attendance in 0..100
    }
}