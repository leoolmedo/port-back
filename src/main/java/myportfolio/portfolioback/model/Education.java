package myportfolio.portfolioback.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Basic
    private String institute;
    private String career;
    private String certificate;
    private String certLink;
    private Date startDate;
    private Date endDate;
    private String webPage;
    private String logo;
    private String place;

    public Education(){}
    
    public Education(long id, String institute, String career, 
            String certificate, String certLink, Date startDate, 
            Date endDate, String webPage, String logo, String place){
        this.career = career;
        this.certificate = certificate;
        this.certLink = certLink;
        this.endDate = endDate;
        this.id = id;
        this.institute = institute;
        this.logo = logo;
        this.startDate = startDate;
        this.webPage = webPage;
        this.place = place;
    }
}
