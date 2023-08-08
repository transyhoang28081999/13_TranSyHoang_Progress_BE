package com.example.studentmanager.controllers;

import com.example.studentmanager.models.Student;
import com.example.studentmanager.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> searchStudents(@RequestParam String partName){
        return studentService.searchStudents(partName);
    }

    @PostMapping
    public String insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @PutMapping("{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }
}
