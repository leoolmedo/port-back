
package myportfolio.portfolioback.service;

import java.util.List;
import myportfolio.portfolioback.model.Work;


public interface IWorkService {
    public List<Work> readWork();
    public void saveWork(Work work);
    public void deleteWork(Work work);
    public void deleteWork(Long id);
    
}
