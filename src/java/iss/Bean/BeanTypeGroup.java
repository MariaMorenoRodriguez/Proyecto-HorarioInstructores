package iss.Bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import iss.Controller.ControllerTypeGroup;
import iss.Model.Typegroup;

@ManagedBean
@RequestScoped
public class BeanTypeGroup {

    private ControllerTypeGroup controller;
    private Typegroup Typegroup;
    private List<Typegroup> lTypegroup = new ArrayList<>();

    public BeanTypeGroup() {
        Typegroup = new Typegroup();
    }

    public ControllerTypeGroup getController() {
        return controller;
    }

    public void setController(ControllerTypeGroup controller) {
        this.controller = controller;
    }

    public Typegroup getTypegroup() {
        return Typegroup;
    }

    public void setTypegroup(Typegroup Typegroup) {
        this.Typegroup = Typegroup;
    }

    public List<Typegroup> getlTypegroup() {
        controller = new ControllerTypeGroup();
        controller.generarListTypegroup();
        lTypegroup = controller.getTypegroup();
        return lTypegroup;
    }

    public void setlTypegroup(List<Typegroup> lTypegroup) {
        this.lTypegroup = lTypegroup;
    }

    public String add() {
        controller = new ControllerTypeGroup();
        try {
            controller.addTypegroup(Typegroup);
            return "ListTypeGroup";
        } catch (Exception e) {

        }
        return "CreateTypeGroup";
    }

}
