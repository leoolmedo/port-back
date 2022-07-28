
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Person;
import myportfolio.portfolioback.repository.personRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonService implements IPersonService{
    
    @Autowired
    public personRepository personRepository;

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> readPerson() {
        return personRepository.findAll();
    }
    
}
