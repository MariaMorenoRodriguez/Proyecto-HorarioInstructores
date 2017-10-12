package iss.Bean;

import iss.Controller.ControllerWorkingday;
import iss.Model.Workingday;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanWorkingday {

    private ControllerWorkingday controlWorkingday;
    private Workingday workingday;
    private List<Workingday> listWorkingday = new ArrayList<>();

    public BeanWorkingday() {
    }

    public List<Workingday> List() {

        return listWorkingday;
    }

    public ControllerWorkingday getControlWorkingday() {
        return controlWorkingday;
    }

    public void setControlWorkingday(ControllerWorkingday controlWorkingday) {
        this.controlWorkingday = controlWorkingday;
    }

    public Workingday getWorkingday() {
        return workingday;
    }

    public void setWorkingday(Workingday workingday) {
        this.workingday = workingday;
    }

    public List<Workingday> getListWorkingday() {
        controlWorkingday = new ControllerWorkingday();
        controlWorkingday.List();
        listWorkingday = controlWorkingday.List();
        return listWorkingday;
    }

    public void setListWorkingday(List<Workingday> listWorkingday) {
        this.listWorkingday = listWorkingday;
    }

    public String add() {
        controlWorkingday = new ControllerWorkingday();
        try {
            controlWorkingday.Add(workingday);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
