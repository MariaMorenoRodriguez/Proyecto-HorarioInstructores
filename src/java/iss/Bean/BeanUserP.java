package iss.Bean;

import iss.Controller.ControllerUserp;
import iss.Model.Userp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanUserP {

    private ControllerUserp controlUserp;
    private Userp userp;
    private List<Userp> listUserp = new ArrayList<>();

    public BeanUserP() {
    }

    public ControllerUserp getControlUserp() {
        return controlUserp;
    }

    public void setControlUserp(ControllerUserp controlUserp) {
        this.controlUserp = controlUserp;
    }

    public Userp getUserp() {
        return userp;
    }

    public void setUserp(Userp userp) {
        this.userp = userp;
    }

    public List<Userp> getListUserp() {
        controlUserp = new ControllerUserp();
        controlUserp.List();
        listUserp = controlUserp.List();
        return listUserp;
    }

    public void setListUserp(List<Userp> listUserp) {
        this.listUserp = listUserp;
    }

    public String add() {
        controlUserp = new ControllerUserp();
        try {
            controlUserp.Add(userp);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
