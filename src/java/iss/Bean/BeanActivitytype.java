package iss.Bean;

import iss.Controller.ControllerActivitytype;
import iss.Model.Activitytype;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanActivitytype {

    private ControllerActivitytype controlActivitytype;
    private Activitytype activitytype;
    private List<Activitytype> listActivitytype = new ArrayList<>();

    public BeanActivitytype() {
    }

    public ControllerActivitytype getControlActivitytype() {
        return controlActivitytype;
    }

    public void setControlActivitytype(ControllerActivitytype controlActivitytype) {
        this.controlActivitytype = controlActivitytype;
    }

    public Activitytype getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Activitytype activitytype) {
        this.activitytype = activitytype;
    }

    public List<Activitytype> getListActivitytype() {
        controlActivitytype = new ControllerActivitytype();
        controlActivitytype.List();
        listActivitytype = controlActivitytype.List();
        return listActivitytype;
    }

    public void setListActivitytype(List<Activitytype> listActivitytype) {
        this.listActivitytype = listActivitytype;
    }

    public String add() {
        controlActivitytype = new ControllerActivitytype();
        try {
            controlActivitytype.Add(activitytype);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }

}
