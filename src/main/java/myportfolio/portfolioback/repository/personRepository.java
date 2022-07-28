
package myportfolio.portfolioback.repository;

import myportfolio.portfolioback.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends JpaRepository <Person, Long> {  
}
