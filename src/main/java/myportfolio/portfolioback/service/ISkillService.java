
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Skill;


public interface ISkillService {
    public List<Skill> readSkills();
    public void saveSkill(Skill skill);
    public void deleteSkill(Skill skill);
    public void deleteSkill(Long id);
}
