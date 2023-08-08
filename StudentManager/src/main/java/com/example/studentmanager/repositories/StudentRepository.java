package com.example.studentmanager.repositories;

import com.example.studentmanager.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select s from Student s where s.name like :partName")
    List<Student> findAllStudentsByPartName(String partName);
}
