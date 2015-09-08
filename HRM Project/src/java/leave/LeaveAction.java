/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leave;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Md.Tarikul Islam
 */
public class LeaveAction extends ActionSupport {
    DAO dao=new DAO();
    Leave leave;
    List<Leave> leavelist;
LeaveForm leaveform;

    public LeaveForm getLeaveform() {
        return leaveform;
    }

    public void setLeaveform(LeaveForm leaveform) {
        this.leaveform = leaveform;
    }
    
  

   

    public Leave getLeave() {
        return leave;
    }

    public void setLeave(Leave leave) {
        this.leave = leave;
    }
    public LeaveAction() {
    }
    
    @Override
    public String execute() {
       
        dao.insert(leave);
        return "success";
        
    }
    
    
    
    
   
}
