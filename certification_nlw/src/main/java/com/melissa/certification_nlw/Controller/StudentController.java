package com.melissa.certification_nlw.Controller;

import com.melissa.certification_nlw.DTO.StudentCertificationAnswerDto;
import com.melissa.certification_nlw.DTO.VerifyHasCertificationDTO;
import com.melissa.certification_nlw.Service.StudentCertificationAnswersUseCase;
import com.melissa.certification_nlw.Service.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    private StudentCertificationAnswersUseCase studentCertificationAnswerUseCase;
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO){
        
        
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if (result){
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova";
    }
    
    @PostMapping("/certification/answer")
    public StudentCertificationAnswerDto certificationAnswer(@RequestBody StudentCertificationAnswerDto dto) throws Exception
    {
        return studentCertificationAnswerUseCase.execute(dto);
    
    }
}
