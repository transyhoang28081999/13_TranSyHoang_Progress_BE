package com.example.studentmanager.repositories;

import com.example.studentmanager.models.ClassA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassARepository extends JpaRepository<ClassA, Long> {
}
