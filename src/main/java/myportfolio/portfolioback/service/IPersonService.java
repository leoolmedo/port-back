
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Person;


public interface IPersonService {
    
    public void savePerson(Person person);
    public List<Person> readPerson();

    
}
