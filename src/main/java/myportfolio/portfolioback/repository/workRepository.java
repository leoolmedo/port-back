
package myportfolio.portfolioback.repository;

import myportfolio.portfolioback.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface workRepository extends JpaRepository<Work, Long> {
}
