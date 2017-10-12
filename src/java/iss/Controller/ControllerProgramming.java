package iss.Controller;

import iss.Model.Programming;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerProgramming {

    private List<Programming> ListProgramming;
    private Programming pro;
    Session sesion;
    Transaction trs;

    public ControllerProgramming() {
    }

    public List<Programming> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            ListProgramming = sesion.createQuery("from Programming").list();
            for (Programming team : ListProgramming) {
                Hibernate.initialize(team.getIdProgramming());
                Hibernate.initialize(team.getHoursToWork());
                Hibernate.initialize(team.getDaysToWork());
            }
            trs.commit();

        } catch (HibernateException e) {
            trs.rollback();
        }
        return ListProgramming;
    }

    public String Add(Programming ac) throws Exception {

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
