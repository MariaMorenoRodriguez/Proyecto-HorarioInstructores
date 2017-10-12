package iss.Controller;

import iss.Model.Person;
import iss.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControllerPerson {

    private List<Person> listPerson;
    private Session sesion;

    public ControllerPerson() {
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public Session getSesion() {
        return sesion;
    }

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    public void searchPerson() {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try {
            ts = sesion.beginTransaction();
            listPerson = sesion.createQuery("FROM Person as p inner join fetch p.locality left join fetch p.phone left join fetch p.userp").list();
            ts.commit();
        } catch (Exception e) {
            ts.rollback();
        } finally {
            sesion.close();
        }
    }

    public void addPerson(Person person) throws Exception {
        sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        ts = sesion.beginTransaction();
        sesion.save(person);
        ts.commit();
        sesion.close();
    }
}
