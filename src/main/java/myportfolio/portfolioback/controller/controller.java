
package myportfolio.portfolioback.controller;

import java.util.List;
import myportfolio.portfolioback.model.Education;
import myportfolio.portfolioback.model.Person;
import myportfolio.portfolioback.model.Skill;
import myportfolio.portfolioback.model.Work;
import myportfolio.portfolioback.service.IEducationService;
import myportfolio.portfolioback.service.IPersonService;
import myportfolio.portfolioback.service.IWorkService;
import myportfolio.portfolioback.service.skillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class controller {
   
    /*************************
     * Mapping for Person *
     * **********************/
    @Autowired
    public IPersonService personService;
    
    @GetMapping ("/readperson")
    @ResponseBody
    public List<Person> readPerson(){
        return personService.readPerson();
    }
    
    @PostMapping ("/saveperson")
    public void savePerson(@RequestBody Person person){
        personService.savePerson(person);
    }
    
     /*************************
     * Mapping for Work *
     * **********************/
    
    @Autowired
    public IWorkService workService;
    
    @GetMapping ("/readwork")
    @ResponseBody
    public List<Work> readWork(){
        return workService.readWork();
    }
    
    @PostMapping ("/savework")
    public void saveWork(@RequestBody Work work){
        workService.saveWork(work);
    }
    
    @DeleteMapping("/delwork/{id}")
    public void delWork(@PathVariable Long id){
        workService.deleteWork(id);
    }
    
    /*************************
    * Mapping for education  *
    * ***********************/
    
    @Autowired
    public IEducationService eduService;
    
    @GetMapping ("/readeducation")
    public List<Education> readEducation(){
        return eduService.readEducacions();
    }
    
    @PostMapping ("/saveeducation")
    @ResponseBody
    public void saveEducation(@RequestBody Education education){
        eduService.saveEducacion(education);
    }
    
    @DeleteMapping ("/deleducation/{id}")
    public void delEducationId(@PathVariable Long id){
        eduService.deleteEducation(id);
    }
    
    /*************************
    *   Mapping for skills   *
    * ***********************/
    
    @Autowired 
    public skillService skillService;
    
    @GetMapping ("readskill")
    public List<Skill> readSkill(){
        return skillService.readSkills();
    }
    
    @PostMapping ("saveskill")
    public void saveSkill(@RequestBody Skill skill){
        skillService.saveSkill(skill);
    }
    
    @DeleteMapping ("/delskill/{id}")
    public void delSkillId(@PathVariable Long id){
        skillService.deleteSkill(id);
    }
            
    
}
