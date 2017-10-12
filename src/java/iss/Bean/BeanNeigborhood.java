package iss.Bean;

import iss.Controller.ControllerNeigborhood;
import iss.Model.Neigborhood;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanNeigborhood {

    private ControllerNeigborhood controlNeigborhood;
    private Neigborhood neigborhood;
    private List<Neigborhood> listNeigborhood = new ArrayList<>();

    public BeanNeigborhood() {
    }

    public ControllerNeigborhood getControlNeigborhood() {
        return controlNeigborhood;
    }

    public void setControlNeigborhood(ControllerNeigborhood controlNeigborhood) {
        this.controlNeigborhood = controlNeigborhood;
    }

    public Neigborhood getNeigborhood() {
        return neigborhood;
    }

    public void setNeigborhood(Neigborhood neigborhood) {
        this.neigborhood = neigborhood;
    }

    public List<Neigborhood> getListNeigborhood() {
        controlNeigborhood = new ControllerNeigborhood();
        controlNeigborhood.List();
        listNeigborhood = controlNeigborhood.List();
        return listNeigborhood;
    }

    public void setListNeigborhood(List<Neigborhood> listNeigborhood) {
        this.listNeigborhood = listNeigborhood;
    }

    public String add() {
        controlNeigborhood = new ControllerNeigborhood();
        try {
            controlNeigborhood.Add(neigborhood);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }

}
