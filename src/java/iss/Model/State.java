package iss.Model;
// Generated 11-oct-2017 10:10:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * State generated by hbm2java
 */
public class State  implements java.io.Serializable {


     private Long idState;
     private String nameEstate;
     private Set<Groupp> groupps = new HashSet<Groupp>(0);

    public State() {
    }

	
    public State(String nameEstate) {
        this.nameEstate = nameEstate;
    }
    public State(String nameEstate, Set<Groupp> groupps) {
       this.nameEstate = nameEstate;
       this.groupps = groupps;
    }
   
    public Long getIdState() {
        return this.idState;
    }
    
    public void setIdState(Long idState) {
        this.idState = idState;
    }
    public String getNameEstate() {
        return this.nameEstate;
    }
    
    public void setNameEstate(String nameEstate) {
        this.nameEstate = nameEstate;
    }
    public Set<Groupp> getGroupps() {
        return this.groupps;
    }
    
    public void setGroupps(Set<Groupp> groupps) {
        this.groupps = groupps;
    }




}

