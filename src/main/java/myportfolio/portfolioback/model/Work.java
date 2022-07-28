
package myportfolio.portfolioback.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Work {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Basic
    private String company;
    private String role;
    private String activities;
    private String reference;
    private String webPage;
    private String logo;  
    private Date startDate;
    private Date endDate;
    private String place;
    
    public Work(){};
    
    public Work(long id, String company, String role, String activities,
             Date startDate, Date endDate, String reference, String webPage,
              String logo){
        this.activities = activities;
        this.company = company;
        this.endDate = endDate;
        this.id = id;
        this.logo = logo;
        this.reference = reference;
        this.role = role;
        this.startDate = startDate;
        this.webPage = webPage;        
    }
}


