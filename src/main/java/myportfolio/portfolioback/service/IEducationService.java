
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Education;


public interface IEducationService {
    public List <Education> readEducacions();
    public void saveEducacion(Education education);
    public void deleteEducation(Education education);
    public void deleteEducation(Long id);
}
