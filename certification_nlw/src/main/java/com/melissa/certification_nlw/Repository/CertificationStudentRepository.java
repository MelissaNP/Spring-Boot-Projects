package com.melissa.certification_nlw.Repository;

import com.melissa.certification_nlw.Modules.CertificationStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {
    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentEntity> findByStudentEmailAndTechnology(@Param("email") String email, @Param("technology") String technology);
}

