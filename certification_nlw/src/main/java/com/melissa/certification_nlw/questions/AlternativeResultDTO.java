package com.melissa.certification_nlw.questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlternativeResultDTO {
    
    private UUID id;
    private String description;
}
