/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package role;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author apcl
 */
public class DAO_Role {

      public Configuration cfg = new Configuration().configure();
    public SessionFactory f = cfg.buildSessionFactory();
    public Session session = f.openSession();
    public  Transaction t = session.beginTransaction();

    public void insertt(Object o) {
        session.save(o);
        t.commit();
        session.close();
    }
    
    
    
   

    String logine(String employeeId, String password) {
         Role role=null ;
        try {
            Query q = session.createQuery("from Role where employeeId=:e and password=:p");
            q.setString("e", employeeId);
            q.setString("p", password);
            role = (Role) q.uniqueResult();
        } catch (HibernateException he) {
            System.out.println(he);
        }
        if(role !=null){
        t.commit();
        session.close();
        return "success";
        }
        else{
        session.close();
        return "error";
        }
        
    }
        
    
    
     String loginm(String departmentId, String password) {
         Role role=null ;
        try {
            Query q = session.createQuery("from Role where departmentId=:d and password=:p");
            q.setString("d", departmentId);
            q.setString("p", password);
            role = (Role) q.uniqueResult();
        } catch (HibernateException he) {
            System.out.println(he);
        }
        if(role !=null){
        t.commit();
        session.close();
        return "success";
        }
        else{
        session.close();
        return "error";
        }
}

  public  void deleteRole(Role role) {
       Role r= (Role) session.load(Role.class, role.getEmployeeId());

        
        session.delete(r);
        t.commit();
        session.close();  
    }

 public   void updateRole(Role role) {
        Role r1 = (Role) session.load(Role.class, role.getEmployeeId());

        r1.setDepartmentId(role.getDepartmentId());
        session.update(r1);
        t.commit();
        session.close();
    }
}
