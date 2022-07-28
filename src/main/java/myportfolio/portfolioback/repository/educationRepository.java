
package myportfolio.portfolioback.repository;

import myportfolio.portfolioback.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educationRepository extends JpaRepository < Education, Long>{   
}