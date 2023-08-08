package com.example.studentmanager.services;

import com.example.studentmanager.models.Student;

import java.util.List;

public interface StudentService {
    public List<Student> searchStudents(String partName);
    public String insertStudent(Student student);

    public String updateStudent(Long id, Student student);

    public String deleteStudent(Long id);
}
