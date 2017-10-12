package iss.Bean;

import iss.Controller.ControllerRol;
import iss.Model.Rol;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanRol {

    private ControllerRol controlRol;
    private Rol rol;
    private List<Rol> listRol = new ArrayList<>();

    public BeanRol() {
    }

    public ControllerRol getControlRol() {
        return controlRol;
    }

    public void setControlRol(ControllerRol controlRol) {
        this.controlRol = controlRol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<Rol> getListRol() {
        controlRol = new ControllerRol();
        controlRol.List();
        listRol = controlRol.List();
        return listRol;
    }

    public void setListRol(List<Rol> listRol) {
        this.listRol = listRol;
    }

    public String add() {
        controlRol = new ControllerRol();
        try {
            controlRol.Add(rol);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
