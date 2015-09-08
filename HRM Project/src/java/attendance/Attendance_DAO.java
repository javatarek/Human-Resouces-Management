/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendance;

import dao.Admin;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Md.Tarikul Islam
 */
public class Attendance_DAO {

      public Configuration cfg = new Configuration().configure();
    public SessionFactory f = cfg.buildSessionFactory();
    public Session session = f.openSession();
    public  Transaction t = session.beginTransaction();

    public void insert(Object o) {
        session.save(o);
        t.commit();
        session.close();
    }

    
        
    @SuppressWarnings("unchecked")
    public List<Attendance> list() {
        
        List<Attendance> attendancelist = null;
        try {
            Query q = session.createQuery("from Attendance");
            attendancelist = q.list();

        } catch (HibernateException he) {
            System.out.println(he);
        }
       // t.commit();
        session.close();
        return attendancelist;
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   

  
}
