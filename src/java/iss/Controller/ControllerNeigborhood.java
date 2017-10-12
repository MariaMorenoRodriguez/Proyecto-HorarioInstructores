package iss.Controller;

import iss.Model.Neigborhood;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerNeigborhood {

    private List<Neigborhood> ListNeigborhood;
    private Neigborhood nei;
    Session sesion;
    Transaction trs;

    public ControllerNeigborhood() {
    }

    public List<Neigborhood> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            ListNeigborhood = sesion.createQuery("from Neigborhood").list();
            for (Neigborhood arse : ListNeigborhood) {
                Hibernate.initialize(arse.getIdNeigBorhood());
                Hibernate.initialize(arse.getNameNeigBorhood());
            }
            trs.commit();

        } catch (HibernateException e) {
            trs.rollback();
        }
        return ListNeigborhood;
    }

    public String Add(Neigborhood a) throws Exception {

        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            sesion.save(a);
            trs.commit();
            sesion.close();
        } catch (HibernateException e) {
        }

        return "si";
    }

}
