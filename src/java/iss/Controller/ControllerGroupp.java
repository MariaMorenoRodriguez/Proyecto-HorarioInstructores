package iss.Controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import iss.Model.Groupp;
import iss.Util.HibernateUtil;

public class ControllerGroupp {

    private List<Groupp> Groupp;
    private Session session;

    public ControllerGroupp() {
    }

    public List<Groupp> getGroupp() {
        return Groupp;
    }

    public void setGroupp(List<Groupp> Groupp) {
        this.Groupp = Groupp;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void generarListGroupp() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Groupp = session.createQuery("FROM Groupp as g inner join fetch g.state left join fetch g.areasena left join fetch g.trainingprogram left join fetch g.typegroup").list();
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
        } finally {
            session.close();
        }
    }

    public void addGroupp(Groupp Groupp) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        ts = session.beginTransaction();
        session.save(Groupp);
        ts.commit();
        session.close();
    }

}
