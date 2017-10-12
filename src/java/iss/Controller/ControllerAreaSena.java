/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss.Controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import iss.Model.Areasena;
import iss.Util.HibernateUtil;

/**
 *
 * @author anime
 */
public class ControllerAreaSena {

    private List<Areasena> Areasena;
    private Session session;

    public ControllerAreaSena() {
    }

    public List<Areasena> getAreasena() {
        return Areasena;
    }

    public void setAreasena(List<Areasena> Areasena) {
        this.Areasena = Areasena;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void generarListAreasena() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            Areasena = session.createQuery("FROM AreaSena").list();
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
        } finally {
            session.close();
        }
    }

    public void addAreasena(Areasena Areasena) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        ts = session.beginTransaction();
        session.save(Areasena);
        ts.commit();
        session.close();
    }

}
