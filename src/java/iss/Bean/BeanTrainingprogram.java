package iss.Bean;

import iss.Controller.ControllerTrainingprogram;
import iss.Model.Trainingprogram;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanTrainingprogram {

    private ControllerTrainingprogram controlTrainingprogram;
    private Trainingprogram trainingprogram;
    private List<Trainingprogram> listTrainingprogram = new ArrayList<>();

    public BeanTrainingprogram() {
    }

    public ControllerTrainingprogram getControlTrainingprogram() {
        return controlTrainingprogram;
    }

    public void setControlTrainingprogram(ControllerTrainingprogram controlTrainingprogram) {
        this.controlTrainingprogram = controlTrainingprogram;
    }

    public Trainingprogram getTrainingprogram() {
        return trainingprogram;
    }

    public void setTrainingprogram(Trainingprogram trainingprogram) {
        this.trainingprogram = trainingprogram;
    }

    public List<Trainingprogram> getListTrainingprogram() {
        controlTrainingprogram = new ControllerTrainingprogram();
        controlTrainingprogram.List();
        listTrainingprogram = controlTrainingprogram.List();
        return listTrainingprogram;
    }

    public void setListTrainingprogram(List<Trainingprogram> listTrainingprogram) {
        this.listTrainingprogram = listTrainingprogram;
    }

    public String add() {
        controlTrainingprogram = new ControllerTrainingprogram();
        try {
            controlTrainingprogram.Add(trainingprogram);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }
}
