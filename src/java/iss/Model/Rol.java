package iss.Model;
// Generated 11-oct-2017 10:10:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Long idrol;
     private String nameRol;
     private Set<Userp> userps = new HashSet<Userp>(0);

    public Rol() {
    }

	
    public Rol(String nameRol) {
        this.nameRol = nameRol;
    }
    public Rol(String nameRol, Set<Userp> userps) {
       this.nameRol = nameRol;
       this.userps = userps;
    }
   
    public Long getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(Long idrol) {
        this.idrol = idrol;
    }
    public String getNameRol() {
        return this.nameRol;
    }
    
    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }
    public Set<Userp> getUserps() {
        return this.userps;
    }
    
    public void setUserps(Set<Userp> userps) {
        this.userps = userps;
    }




}


