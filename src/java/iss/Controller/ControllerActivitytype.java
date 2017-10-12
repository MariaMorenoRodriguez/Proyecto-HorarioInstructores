package iss.Controller;

import iss.Model.Activitytype;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerActivitytype {

    private List<Activitytype> ListActivitytype;
    private Activitytype act;
    Session sesion;
    Transaction trs;

    public ControllerActivitytype() {
    }

    public List<Activitytype> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            ListActivitytype = sesion.createQuery("from Teamformationarea").list();
            for (Activitytype team : ListActivitytype) {
                Hibernate.initialize(team.getIdActivityType());
                Hibernate.initialize(team.getNameActivityType());
            }
            trs.commit();

        } catch (HibernateException e) {
            trs.rollback();
        }
        return ListActivitytype;
    }

    public String Add(Activitytype ac) throws Exception {

        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            sesion.save(ac);
            trs.commit();
            sesion.close();
        } catch (HibernateException e) {
        }

        return "si";
    }
}
