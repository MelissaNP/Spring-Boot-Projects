package com.melissa.certification_nlw.Modules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name= "certifications")
public class CertificationStudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column(length = 100)
    @JoinColumn(name = "student_id")
    private UUID studentID;
    
    @Column(length = 100)
    private String technology;
    
    @Column(length = 10)
    private int grade;
    
    @ManyToOne
    @JoinColumn(name= "student_id", insertable = false, updatable = false)
    private StudentEntity studentEntity;
    
    @OneToMany
    @JoinColumn(name= "answer_certification_id", insertable = false, updatable = false)
    private List<AnswersCertificationEntity> answersCertificationEntities;
    
    @CreationTimestamp
    private LocalDateTime createAt;
}