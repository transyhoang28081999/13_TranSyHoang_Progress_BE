package com.example.studentmanager.services;

import com.example.studentmanager.models.Student;
import com.example.studentmanager.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> searchStudents(String partName) {
        String newPartName = "%" + partName + "%";
        return studentRepository.findAllStudentsByPartName(newPartName);
    }

    @Override
    public String insertStudent(Student student) {
        try{
            studentRepository.save(student);
            return "Insert successfully!";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @Override
    public String updateStudent(Long id, Student student) {
        try {
            Optional<Student> stu = studentRepository.findById(id);
            if(!stu.isPresent()) return "This student does not exist!";
            student.setId(id);
            studentRepository.save(student);
            return "Update successfully!";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @Override
    public String deleteStudent(Long id) {
        try{
            Optional<Student> stu = studentRepository.findById(id);
            if(!stu.isPresent()) return "This student does not exist!";
            studentRepository.deleteById(id);
            return "Delete Successfully!";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
