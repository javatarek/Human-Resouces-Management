/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author personal
 */
public class DAO {
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
    public List<Admin> list() {
        
        List<Admin> adminlist = null;
        try {
            Query q = session.createQuery("from Admin");
            adminlist = q.list();

        } catch (HibernateException he) {
            System.out.println(he);
        }
       // t.commit();
        session.close();
        return adminlist;
    }
    

    public String login(String userId, String password) {
        
        Admin admin=null ;
        try {
            Query q = session.createQuery("from Admin where userId=:u and password=:p");
            q.setString("u", userId);
            q.setString("p", password);
            admin = (Admin) q.uniqueResult();
        } catch (HibernateException he) {
            System.out.println(he);
        }
        if(admin !=null){
        t.commit();
        session.close();
        return "success";
        }
        else{
        session.close();
        return "error";
        }
    } 
    
    
    
      
    @SuppressWarnings("unchecked")
    public List<Employees> employees() {
        
        List<Employees> employeelist = null;
        try {
            Query q = session.createQuery("from Employees");
            employeelist = q.list();

        } catch (HibernateException he) {
            System.out.println(he);
        }
       // t.commit();
        session.close();
        return employeelist;
    }

   public void updateEmployee(Employees employee) {
          Employees e = (Employees) session.load(Employees.class, employee.getEmployeeId());

        e.setDepartmentId(employee.getDepartmentId());
        session.update(e);
        t.commit();
        session.close();
    }

public    List<Employees> employeesprofile(String employeeId) {
         List<Employees> elist = null;
        try {
            Query q = session.createQuery("from Employees where employeeId=:e ");
            q.setString("e", employeeId);
            elist = q.list();

        } catch (HibernateException he) {
            System.out.println(he);
        }
       // t.commit();
        session.close();
        return elist;
    }

  public List<Admin> adminprofile(String userId) {
         List<Admin> alist = null;
        try {
            Query q = session.createQuery("from Admin where userId=:a");
            q.setString("a", userId);
            alist = q.list();

        } catch (HibernateException he) {
            System.out.println(he);
        }
       // t.commit();
        session.close();
        return alist;
    }

    List<Employees> managerprofile(String employeeId) {
       List<Employees> elist = null;
        try {
            Query q = session.createQuery("from Employees where employeeId=:e ");
            q.setString("e", employeeId);
            elist = q.list();

        } catch (HibernateException he) {
            System.out.println(he);
        }
       // t.commit();
        session.close();
        return elist;
    }

     
    
}
