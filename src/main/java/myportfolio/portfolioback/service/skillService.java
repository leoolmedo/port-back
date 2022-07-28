
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Skill;
import myportfolio.portfolioback.repository.skillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class skillService implements ISkillService {

    @Autowired
    public skillRepository skillRepository;
    
    @Override
    public List<Skill> readSkills() {
        return skillRepository.findAll();
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Skill skill) {
        skillRepository.delete(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
    
}
