package iss.Bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import iss.Controller.ControllerTypeSpaceFormation;
import iss.Model.Typespaceformation;

@ManagedBean
@RequestScoped
public class BeanTypeSpaceFormation {

    private ControllerTypeSpaceFormation controller;
    private Typespaceformation Typespaceformation;
    private List<Typespaceformation> lTypespaceformation = new ArrayList<>();

    public BeanTypeSpaceFormation() {
        Typespaceformation = new Typespaceformation();
    }

    public ControllerTypeSpaceFormation getController() {
        return controller;
    }

    public void setController(ControllerTypeSpaceFormation controller) {
        this.controller = controller;
    }

    public Typespaceformation getTypespaceformation() {
        return Typespaceformation;
    }

    public void setTypespaceformation(Typespaceformation Typespaceformation) {
        this.Typespaceformation = Typespaceformation;
    }

    public List<Typespaceformation> getlTypespaceformation() {
        controller = new ControllerTypeSpaceFormation();
        controller.generarListTypespaceformation();
        lTypespaceformation = controller.getTypeespaceformation();
        return lTypespaceformation;
    }

    public void setlTypespaceformation(List<Typespaceformation> lTypespaceformation) {
        this.lTypespaceformation = lTypespaceformation;
    }

    public String add() {
        controller = new ControllerTypeSpaceFormation();
        try {
            controller.addTypespaceformation(Typespaceformation);
            return "ListTypeSpaceFormation";
        } catch (Exception e) {

        }
        return "CreateTypeSpaceFormation";
    }

}
