package iss.Controller;

import iss.Model.Trainingprogram;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerTrainingprogram {

    private List<Trainingprogram> ListTrainingprogram;
    private Trainingprogram act;
    Session sesion;
    Transaction trs;

    public ControllerTrainingprogram() {
    }

    public List<Trainingprogram> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            ListTrainingprogram = sesion.createQuery("from Trainingprogram").list();
            for (Trainingprogram team : ListTrainingprogram) {
                Hibernate.initialize(team.getIdTrainingProgram());
                Hibernate.initialize(team.getNameTrainingProgram());
            }
            trs.commit();

        } catch (HibernateException e) {
            trs.rollback();
        }
        return ListTrainingprogram;
    }

    public String Add(Trainingprogram ac) throws Exception {

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
