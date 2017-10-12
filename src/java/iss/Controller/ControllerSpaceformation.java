package iss.Controller;

import iss.Model.Spaceformation;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerSpaceformation {

    private List<Spaceformation> ListSpaceformation;
    private Spaceformation act;
    Session sesion;
    Transaction trs;

    public ControllerSpaceformation() {
    }

    public List<Spaceformation> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            ListSpaceformation = sesion.createQuery("from Spaceformation").list();
            for (Spaceformation team : ListSpaceformation) {
                Hibernate.initialize(team.getIdSpaceFormation());
                Hibernate.initialize(team.getSpaceFormation());
            }
            trs.commit();

        } catch (HibernateException e) {
            trs.rollback();
        }
        return ListSpaceformation;
    }

    public String Add(Spaceformation ac) throws Exception {

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
