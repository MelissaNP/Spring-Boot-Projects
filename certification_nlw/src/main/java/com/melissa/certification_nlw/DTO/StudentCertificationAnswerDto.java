package com.melissa.certification_nlw.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCertificationAnswerDto {
    private String email;
    private String name;
    private String tecnology;
    private List<QuestionAnswersDTO> questionsAnswers;
    
}
