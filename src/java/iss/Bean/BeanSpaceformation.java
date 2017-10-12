package iss.Bean;

import iss.Controller.ControllerSpaceformation;
import iss.Model.Spaceformation;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanSpaceformation {

    private ControllerSpaceformation controlSpaceformation;
    private Spaceformation spaceformation;
    private List<Spaceformation> listSpaceformation = new ArrayList<>();

    public BeanSpaceformation() {
    }

    public ControllerSpaceformation getControlSpaceformation() {
        return controlSpaceformation;
    }

    public void setControlSpaceformation(ControllerSpaceformation controlSpaceformation) {
        this.controlSpaceformation = controlSpaceformation;
    }

    public Spaceformation getSpaceformation() {
        return spaceformation;
    }

    public void setSpaceformation(Spaceformation spaceformation) {
        this.spaceformation = spaceformation;
    }

    public List<Spaceformation> getListSpaceformation() {
        controlSpaceformation = new ControllerSpaceformation();
        controlSpaceformation.List();
        listSpaceformation = controlSpaceformation.List();
        return listSpaceformation;
    }

    public void setListSpaceformation(List<Spaceformation> listSpaceformation) {
        this.listSpaceformation = listSpaceformation;
    }

    public String add() {
        controlSpaceformation = new ControllerSpaceformation();
        try {
            controlSpaceformation.Add(spaceformation);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
