package iss.Bean;

import iss.Controller.ControllerPhone;
import iss.Model.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanPhone {

    private ControllerPhone controlPhone;
    private Phone phone;
    private List<Phone> listPhone = new ArrayList<>();

    public BeanPhone() {
    }

    public ControllerPhone getControlPhone() {
        return controlPhone;
    }

    public void setControlPhone(ControllerPhone controlPhone) {
        this.controlPhone = controlPhone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Phone> getListPhone() {
        controlPhone = new ControllerPhone();
        controlPhone.List();
        listPhone = controlPhone.List();
        return listPhone;
    }

    public void setListPhone(List<Phone> listPhone) {
        this.listPhone = listPhone;
    }

    public String add() {
        controlPhone = new ControllerPhone();
        try {
            controlPhone.Add(phone);
            return "index";
        } catch (Exception e) {

        }
        return "Creado Con Exito";
    }

}
