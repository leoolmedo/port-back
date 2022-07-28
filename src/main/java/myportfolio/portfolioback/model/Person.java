
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
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Basic
    private String names;
    private String lastNames;
    private String phone;
    private String cellPhone;
    private String email;
    private String workEmail;
    private String address;
    private String city;
    private String state;
    private String country;
    private String user;
    private String password;
    private Date bornDate;
    private String about;
    private String profilePicture;
    
    
    public Person(){
        
    }
    
    public Person(Long id, String names, String lastNames, String email, 
            String workEmail, String address, String state, String country,  
            String user, String password){
        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.email = email;
        this.workEmail = workEmail;
        this.address = address;
        this.state = state;
        this.country = country;
        this.user = user;
        this.password = password;
    }
}
