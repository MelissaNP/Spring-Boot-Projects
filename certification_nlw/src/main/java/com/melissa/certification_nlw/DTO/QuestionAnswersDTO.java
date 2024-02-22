package com.melissa.certification_nlw.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionAnswersDTO {
    private UUID questionID;
    private UUID alternativeID;
    private Boolean isCorrect;
}
