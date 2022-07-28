/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Education;
import myportfolio.portfolioback.repository.educationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leonardo
 */
@Service
public class EducationService implements IEducationService{

    @Autowired
    public educationRepository educationRepository;
            
    @Override
    public List<Education> readEducacions() {
        return educationRepository.findAll();
    }

    @Override
    public void saveEducacion(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void deleteEducation(Education education) {
        educationRepository.delete(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }
    
}
