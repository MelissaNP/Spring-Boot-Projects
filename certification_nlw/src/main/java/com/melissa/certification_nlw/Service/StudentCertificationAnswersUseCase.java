package com.melissa.certification_nlw.Service;

import com.melissa.certification_nlw.DTO.StudentCertificationAnswerDto;
import com.melissa.certification_nlw.Repository.QuestionsRepository;
import com.melissa.certification_nlw.Repository.StudentRepository;
import com.melissa.certification_nlw.questions.QuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCertificationAnswersUseCase {
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private QuestionsRepository questionsRepository;
    
    public StudentCertificationAnswerDto execute(StudentCertificationAnswerDto dto) {
        
            List<QuestionEntity> questionEntity = questionsRepository.findByTechnology(dto.getTecnology());
            
            dto.getQuestionsAnswers().forEach(questionAnswer -> {
                var question = questionEntity.stream()
                        .filter(questionFilter -> questionFilter.getId().equals(questionAnswer.getQuestionID()))
                        .findFirst().orElse(null);
                
                if (question != null) {
                    var findCorrectAlternative = question.getAlternativeEntities().stream()
                            .filter(alternative -> alternative.getIsCorrect()).findFirst().orElse(null);
                    
                    if (findCorrectAlternative != null && findCorrectAlternative.getId().equals(questionAnswer.getAlternativeID())) {
                        questionAnswer.setIsCorrect(true);
                    } else {
                        questionAnswer.setIsCorrect(false);
                    }
                } else {
                    questionAnswer.setIsCorrect(false);
                }
            });
        return dto;
    }
    }
    
