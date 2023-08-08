package com.example.studentmanager.securities.repositories;

import com.example.studentmanager.securities.models.ERole;
import com.example.studentmanager.securities.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
