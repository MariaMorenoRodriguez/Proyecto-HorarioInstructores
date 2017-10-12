package iss.Bean;

import iss.Controller.ControllerState;
import iss.Model.State;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanState {

    public BeanState() {
    }

    private State statee;
    private List<State> listState = new ArrayList<>();
    private ControllerState controlState;

    public State getStatee() {
        return statee;
    }

    public void setStatee(State statee) {
        this.statee = statee;
    }

    public List<State> getListState() {
        controlState = new ControllerState();
        controlState.List();
        listState = controlState.List();
        return listState;
    }

    public void setListState(List<State> listState) {
        this.listState = listState;
    }

    public ControllerState getControlState() {
        return controlState;
    }

    public void setControlState(ControllerState controlState) {
        this.controlState = controlState;
    }

    public String add() {
        controlState = new ControllerState();
        try {
            controlState.Add(statee);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
