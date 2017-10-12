package iss.Bean;

import iss.Controller.ControllerPerson;
import iss.Model.Person;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class BeanPerson {

    private Person person;
    private ControllerPerson controllerPerson;
    private List<Person> listPerson = new ArrayList<>();

    public BeanPerson() {
        person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ControllerPerson getControllerPerson() {
        return controllerPerson;
    }

    public void setControllerPerson(ControllerPerson controllerPerson) {
        this.controllerPerson = controllerPerson;
    }

    public List<Person> getListPerson() {
        controllerPerson = new ControllerPerson();
        controllerPerson.searchPerson();
        listPerson = controllerPerson.getListPerson();
        return listPerson;
    }

    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public String add() {
        controllerPerson = new ControllerPerson();
        try {
            controllerPerson.addPerson(person);
            return "MostrarPersonas";
        } catch (Exception e) {

        }
        return "CrearPersonas";
    }
}
