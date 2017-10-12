package iss.Controller;

import iss.Model.State;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerState {

    private List<State> ListState;
    Session sesion;
    Transaction trs;

    public List<State> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();
        trs = sesion.beginTransaction();
        try {
            ListState = sesion.createQuery("from State").list();
        } catch (Exception e) {

        }
        return ListState;

    }

    public String Add(State ac) throws Exception {

        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            sesion.save(ac);
            trs.commit();
            sesion.close();
        } catch (Exception e) {
        }

        return "si";
    }

}
