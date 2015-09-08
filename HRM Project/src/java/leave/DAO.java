/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leave;

 
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Md.Tarikul Islam
 */
public class DAO {
    public Configuration cfg=new Configuration().configure();
    public SessionFactory f=cfg.buildSessionFactory();
    public Session session=f.openSession();
    public Transaction t=session.beginTransaction();

    void insert(Object o) {
       session.save(o);
       t.commit();
       session.close();
        
    }

    
        
         
        
    }

     

    
 

     
 
