package iss.Controller;

import iss.Model.Workingday;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerWorkingday {

    private List<Workingday> ListWorkingday;
    private Workingday act;
    Session sesion;
    Transaction trs;

    public ControllerWorkingday() {
    }

    public List<Workingday> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            ListWorkingday = sesion.createQuery("from Workingday").list();
            for (Workingday team : ListWorkingday) {
                Hibernate.initialize(team.getIdWorkingDay());
                Hibernate.initialize(team.getWorkingDayName());
                Hibernate.initialize(team.getStartTime());
                Hibernate.initialize(team.getFinishTime());

            }
            trs.commit();

        } catch (HibernateException e) {
            trs.rollback();
        }
        return ListWorkingday;
    }

    public String Add(Workingday ac) throws Exception {

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
