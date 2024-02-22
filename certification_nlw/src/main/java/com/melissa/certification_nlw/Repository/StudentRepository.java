package com.melissa.certification_nlw.Repository;

import com.melissa.certification_nlw.Modules.StudentEntity;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;


public interface StudentRepository extends JpaRepository <StudentEntity, UUID>{
    
    public Optional<StudentEntity> findByEmail(String email);
}
