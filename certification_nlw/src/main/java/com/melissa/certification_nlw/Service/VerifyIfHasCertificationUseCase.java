package com.melissa.certification_nlw.Service;

import com.melissa.certification_nlw.DTO.VerifyHasCertificationDTO;
import com.melissa.certification_nlw.Repository.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;
    public boolean execute(VerifyHasCertificationDTO dto){
       var result= this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(),
                dto.getTechnology());
       if(!result.isEmpty()){
           return true;
       }
       return false;
    }
}
