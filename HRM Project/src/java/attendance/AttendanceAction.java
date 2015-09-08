/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendance;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Md.Tarikul Islam
 */
public class AttendanceAction extends ActionSupport {
    Attendance_DAO dao=new Attendance_DAO();
    Attendance attendance;
    List<Attendance> attendancelist;

    public List<Attendance> getAttendancelist() {
        return attendancelist;
    }

    public void setAttendancelist(List<Attendance> attendancelist) {
        this.attendancelist = attendancelist;
    }
    

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
    public AttendanceAction() {
    }
    
    @Override
    public String execute() throws Exception {
       
         dao.insert(attendance);
          
         return "success";
    
    }
     public String attendanceview() {
        attendancelist = dao.list();
        return "success";
    } 
    
    
}
