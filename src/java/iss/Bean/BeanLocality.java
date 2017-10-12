package iss.Bean;

import iss.Controller.ControllerLocality;
import iss.Model.Locality;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class BeanLocality{

    private ControllerLocality controlLocality;
    private Locality locality;
    private List<SelectItem> listLocality ;

    public BeanLocality() {
    }

    public ControllerLocality getControlLocality() {
        return controlLocality;
    }

    public void setControlLocality(ControllerLocality controlLocality) {
        this.controlLocality = controlLocality;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public List<SelectItem> getListLocality() {
        this.listLocality = new ArrayList<>();
        controlLocality.List();
        return listLocality;
    }

    public void setListLocality(List<SelectItem> listLocality) {
        this.listLocality = listLocality;
    }

    public String add() {
        controlLocality = new ControllerLocality();
        try {
            controlLocality.Add(locality);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
