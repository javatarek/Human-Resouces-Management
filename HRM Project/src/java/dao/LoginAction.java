/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Md. Tarikul Islam
 */
public class LoginAction extends ActionSupport {
    
    Employees employee;
     List<Employees> employeelist;
    Admin admin;
    List<Admin> admList;
    
   
    
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public Date hireDate;

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employees getEmployee() {
        return employee;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    public List<Employees> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(List<Employees> employeelist) {
        this.employeelist = employeelist;
    }
   
   

     

    
   
    DAO dao=new DAO();

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
     public List<Admin> getAdmList() {
        return admList;
    }

    public void setAdmList(List<Admin> admList) {
        this.admList = admList;
    }
   
    @Override
    public String execute() {
        dao.insert(admin);
        return "success";
    }
    
    public String logina() {
        String a=dao.login(admin.getUserId(), admin.getPassword());
        return a;
    }
    
     
    
     public String view() {
        admList = dao.list();
        return "success";
    } 
     
     
      public String employeeView() {
        employeelist = dao.employees();
        return "success";
    } 
      
      
     public String insert(){
         dao.insert(employee);
          
         return "success";
     }
     
     public String updateEmployee(){
         employee=new Employees(employee.getEmployeeId(),employee.getManagerId(),employee.getDepartmentId(),employee.getJobId(),employee.getSalary(),employee.getCommissionPct());
         dao.updateEmployee(employee);
         return "success";
     }
     
   public String viewProfile(){
       employeelist = dao.employeesprofile(employee.getEmployeeId());
       return "success";
   }
    
    public String adminProfile(){
       admList = dao.adminprofile(admin.getUserId());
       return "success";
   }
   
     public String viewMProfile(){
       employeelist = dao.managerprofile(employee.getEmployeeId());
       return "success";
   }
    
    
    
 
}
