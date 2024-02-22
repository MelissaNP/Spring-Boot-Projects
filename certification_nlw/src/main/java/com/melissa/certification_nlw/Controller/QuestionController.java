package com.melissa.certification_nlw.Controller;

import com.melissa.certification_nlw.Repository.QuestionsRepository;
import com.melissa.certification_nlw.questions.AlternativeEntity;
import com.melissa.certification_nlw.questions.AlternativeResultDTO;
import com.melissa.certification_nlw.questions.QuestionEntity;
import com.melissa.certification_nlw.questions.QuestionResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    
    @Autowired
    private QuestionsRepository questionsRepository;
    
    @GetMapping("/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology) {
        System.out.println("TECH=== " + technology);
        List<QuestionEntity> result = this.questionsRepository.findByTechnology(technology);
        return result.stream().map(this::mapQuestionToDTO).collect(Collectors.toList());
    }
    
    private QuestionResultDTO mapQuestionToDTO(QuestionEntity question) {
        QuestionResultDTO questionResultDTO = new QuestionResultDTO();
        questionResultDTO.setId(question.getId());
        questionResultDTO.setTechnology(question.getTechnology());
        questionResultDTO.setDescription(question.getDescription());
        
        List<AlternativeResultDTO> alternativeResultDTOs = question.getAlternativeEntities().stream()
                .map(this::mapAlternativeToDTO)
                .collect(Collectors.toList());
        questionResultDTO.setAlternatives(alternativeResultDTOs);
        return questionResultDTO;
    }
    
    private AlternativeResultDTO mapAlternativeToDTO(AlternativeEntity alternative) {
        AlternativeResultDTO alternativeResultDTO = new AlternativeResultDTO();
        alternativeResultDTO.setId(alternative.getId());
        alternativeResultDTO.setDescription(alternative.getDescription());
        return alternativeResultDTO;
    }
}
