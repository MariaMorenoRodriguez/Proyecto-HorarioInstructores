package iss.Bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import iss.Controller.ControllerAreaSena;
import iss.Model.Areasena;

@ManagedBean
@RequestScoped
public class BeanAreaSena {

    private ControllerAreaSena controller;
    private Areasena Areasena;
    private List<Areasena> lAreasena = new ArrayList<>();

    public BeanAreaSena() {
        Areasena = new Areasena();
    }

    public ControllerAreaSena getController() {
        return controller;
    }

    public void setController(ControllerAreaSena controller) {
        this.controller = controller;
    }

    public Areasena getAreasena() {
        return Areasena;
    }

    public void setAreasena(Areasena Areasena) {
        this.Areasena = Areasena;
    }

    public List<Areasena> getlAreasena() {
        controller = new ControllerAreaSena();
        controller.generarListAreasena();
        lAreasena = controller.getAreasena();
        return lAreasena;
    }

    public void setlAreasena(List<Areasena> lAreasena) {
        this.lAreasena = lAreasena;
    }

    public String add() {
        controller = new ControllerAreaSena();
        try {
            controller.addAreasena(Areasena);
            return "ListAreaSena";
        } catch (Exception e) {

        }
        return "CreateAreaSena";
    }

}
