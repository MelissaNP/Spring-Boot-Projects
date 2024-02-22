package com.melissa.certification_nlw.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class VerifyHasCertificationDTO{
    private String email;
    private String technology;
    
}
