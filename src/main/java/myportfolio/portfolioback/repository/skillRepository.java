
package myportfolio.portfolioback.repository;


import myportfolio.portfolioback.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillRepository extends JpaRepository<Skill, Long>{  
}
