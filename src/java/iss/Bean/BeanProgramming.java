package iss.Bean;

import iss.Controller.ControllerProgramming;
import iss.Model.Programming;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanProgramming {

    private ControllerProgramming controlProgramming;
    private Programming programming;
    private List<Programming> listProgramming = new ArrayList<>();

    public BeanProgramming() {
    }

    public ControllerProgramming getControlProgramming() {
        return controlProgramming;
    }

    public void setControlProgramming(ControllerProgramming controlProgramming) {
        this.controlProgramming = controlProgramming;
    }

    public Programming getProgramming() {
        return programming;
    }

    public void setProgramming(Programming programming) {
        this.programming = programming;
    }

    public List<Programming> getListProgramming() {
        controlProgramming = new ControllerProgramming();
        controlProgramming.List();
        listProgramming = controlProgramming.List();
        return listProgramming;
    }

    public void setListProgramming(List<Programming> listProgramming) {
        this.listProgramming = listProgramming;
    }

    public String add() {
        controlProgramming = new ControllerProgramming();
        try {
            controlProgramming.Add(programming);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
