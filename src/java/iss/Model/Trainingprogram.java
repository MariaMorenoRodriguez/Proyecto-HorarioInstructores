package iss.Model;
// Generated 11-oct-2017 10:10:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Trainingprogram generated by hbm2java
 */
public class Trainingprogram  implements java.io.Serializable {


     private Long idTrainingProgram;
     private Typetrainingprogram typetrainingprogram;
     private String nameTrainingProgram;
     private Set<Groupp> groupps = new HashSet<Groupp>(0);

    public Trainingprogram() {
    }

	
    public Trainingprogram(Typetrainingprogram typetrainingprogram, String nameTrainingProgram) {
        this.typetrainingprogram = typetrainingprogram;
        this.nameTrainingProgram = nameTrainingProgram;
    }
    public Trainingprogram(Typetrainingprogram typetrainingprogram, String nameTrainingProgram, Set<Groupp> groupps) {
       this.typetrainingprogram = typetrainingprogram;
       this.nameTrainingProgram = nameTrainingProgram;
       this.groupps = groupps;
    }
   
    public Long getIdTrainingProgram() {
        return this.idTrainingProgram;
    }
    
    public void setIdTrainingProgram(Long idTrainingProgram) {
        this.idTrainingProgram = idTrainingProgram;
    }
    public Typetrainingprogram getTypetrainingprogram() {
        return this.typetrainingprogram;
    }
    
    public void setTypetrainingprogram(Typetrainingprogram typetrainingprogram) {
        this.typetrainingprogram = typetrainingprogram;
    }
    public String getNameTrainingProgram() {
        return this.nameTrainingProgram;
    }
    
    public void setNameTrainingProgram(String nameTrainingProgram) {
        this.nameTrainingProgram = nameTrainingProgram;
    }
    public Set<Groupp> getGroupps() {
        return this.groupps;
    }
    
    public void setGroupps(Set<Groupp> groupps) {
        this.groupps = groupps;
    }




}

