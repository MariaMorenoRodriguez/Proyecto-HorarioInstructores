package iss.Controller;

import iss.Model.Institute;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerInstitute {

    private List<Institute> ListInstitute;
    private Institute institute;
    Session sesion;
    Transaction trs;

    public ControllerInstitute() {
    }

    public List<Institute> List() {
        sesion = HibernateUtil.getSessionFactory().openSession();

        try {
            trs = sesion.beginTransaction();
            ListInstitute = sesion.createQuery("from Institute").list();
            for (Institute i : ListInstitute) {
                Hibernate.initialize(i.getIdInstitute());
                Hibernate.initialize(i.getNameInstitute());
                Hibernate.initialize(i.getHeadquarters());
                Hibernate.initialize(i.getAddress());
                Hibernate.initialize(i.getEmail());
            }
            trs.commit();

        } catch (HibernateException e) {
            trs.rollback();
        }
        return ListInstitute;
    }

    public String Add(Institute ac) throws Exception {

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
