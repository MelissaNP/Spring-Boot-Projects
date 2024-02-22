package com.melissa.certification_nlw.Repository;

import com.melissa.certification_nlw.questions.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface QuestionsRepository extends JpaRepository<QuestionEntity, UUID> {
    List<QuestionEntity> findByTechnology(String Technology);
    
}
