package iss.Bean;

import iss.Controller.ControllerInstitute;
import iss.Model.Institute;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanInstitute {

    private ControllerInstitute controlInstitute;
    private Institute institute;
    private List<Institute> listInstitute = new ArrayList<>();

    public BeanInstitute() {
    }

    public ControllerInstitute getControlInstitute() {
        return controlInstitute;
    }

    public void setControlInstitute(ControllerInstitute controlInstitute) {
        this.controlInstitute = controlInstitute;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public List<Institute> getListInstitute() {
        return listInstitute;
    }

    public void setListInstitute(List<Institute> listInstitute) {
        this.listInstitute = listInstitute;
    }

    public String add() {
        controlInstitute = new ControllerInstitute();
        try {
            controlInstitute.Add(institute);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
