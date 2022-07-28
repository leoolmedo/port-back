
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Work;
import myportfolio.portfolioback.repository.workRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorkService implements IWorkService {

    @Autowired
    public workRepository workRepository;
    
    @Override
    public List<Work> readWork() {
        return workRepository.findAll();
    }

    @Override
    public void saveWork(Work work) {
        workRepository.save(work);
    }

    @Override
    public void deleteWork(Work work) {
        workRepository.delete(work);
    }

    @Override
    public void deleteWork(Long id) {
        workRepository.deleteById(id);
    }
    
}
