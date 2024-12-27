package com.example.studentsapp.utils

import com.example.studentsapp.models.Student

object StudentRepository {
    val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun getStudentById(id: String?): Student? {
        return students.find { it.id == id }
    }

    fun deleteStudent(student: Student) {
        students.remove(student)
    }
}

