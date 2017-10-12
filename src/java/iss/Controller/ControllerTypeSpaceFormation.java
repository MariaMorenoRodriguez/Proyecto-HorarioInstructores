package iss.Controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import iss.Model.Typespaceformation;
import iss.Util.HibernateUtil;

public class ControllerTypeSpaceFormation {

    private List<Typespaceformation> Typeespaceformation;
    private Session session;

    public ControllerTypeSpaceFormation() {
    }

    public List<Typespaceformation> getTypeespaceformation() {
        return Typeespaceformation;
    }

    public void setTypeespaceformation(List<Typespaceformation> Typeespaceformation) {
        this.Typeespaceformation = Typeespaceformation;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void generarListTypespaceformation() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Typeespaceformation = session.createQuery("FROM TypeSpaceFormation").list();
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
        } finally {
            session.close();
        }
    }

    public void addTypespaceformation(Typespaceformation Typespaceformation) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        ts = session.beginTransaction();
        session.save(Typespaceformation);
        ts.commit();
        session.close();
    }

}
