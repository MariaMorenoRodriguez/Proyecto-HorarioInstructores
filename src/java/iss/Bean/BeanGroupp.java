package iss.Bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import iss.Controller.ControllerGroupp;
import iss.Model.Groupp;

@ManagedBean
@ViewScoped
public class BeanGroupp {

    private ControllerGroupp controller;
    private Groupp Groupp;
    private List<Groupp> lGroupp = new ArrayList<>();

    public BeanGroupp() {
        Groupp = new Groupp();
    }

    public ControllerGroupp getController() {
        return controller;
    }

    public void setController(ControllerGroupp controller) {
        this.controller = controller;
    }

    public Groupp getGroupp() {
        return Groupp;
    }

    public void setGroupp(Groupp Groupp) {
        this.Groupp = Groupp;
    }

    public List<Groupp> getlGroupp() {
        controller = new ControllerGroupp();
        controller.generarListGroupp();
        lGroupp = controller.getGroupp();
        return lGroupp;
    }

    public void setlGroupp(List<Groupp> lGroupp) {
        this.lGroupp = lGroupp;
    }

    public String add() {
        controller = new ControllerGroupp();
        try {
            controller.addGroupp(Groupp);
            return "ListGroupp";
        } catch (Exception e) {

        }
        return "CreateGroupp";
    }

}
