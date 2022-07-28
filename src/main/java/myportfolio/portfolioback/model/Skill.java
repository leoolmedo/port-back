
package myportfolio.portfolioback.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Basic
    private int ratio;
    private String name;
    private String logo;
    private String link;
    private boolean kind; //true: hardSkill false: SoftSkill 
    
    public Skill(){}
    
    public Skill(long id, String name, String logo, String link, int ratio, boolean kind){
        this.id = id;
        this.link = link;
        this.logo = logo;
        this.name = name;
        this.ratio = ratio;
        this.kind = kind;   //true: hardSkill false: SoftSkill
    }
}
