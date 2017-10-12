package iss.Controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import iss.Model.Typegroup;
import iss.Util.HibernateUtil;

public class ControllerTypeGroup {

    private List<Typegroup> Typegroup;
    private Session session;

    public ControllerTypeGroup() {
    }

    public List<Typegroup> getTypegroup() {
        return Typegroup;
    }

    public void setTypegroup(List<Typegroup> Typegroup) {
        this.Typegroup = Typegroup;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void generarListTypegroup() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Typegroup = session.createQuery("FROM TypeGroup").list();
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
        } finally {
            session.close();
        }
    }

    public void addTypegroup(Typegroup Typegroup) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        ts = session.beginTransaction();
        session.save(Typegroup);
        ts.commit();
        session.close();
    }

}
