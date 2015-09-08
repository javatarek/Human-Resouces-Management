/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package role;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author apcl
 */
public class RoleAction extends ActionSupport {
    Role role;
    

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    DAO_Role rolee= new DAO_Role();
    
    
      public String createRole(){
       rolee.insertt(role);
          
         return "success";
   }
       public String logine() {
        String a=rolee.logine(role.getEmployeeId(), role.getPassword());
        return a;
    }
       public String loginm() {
        String a=rolee.loginm(role.getDepartmentId(), role.getPassword());
        return a;
    }
       
       
       public String revokeRole(){
           role=new Role(role.getEmployeeId());
           rolee.deleteRole(role);
           
           return "success";
       }
      
       
       public String updateRole(){
         role=new Role(role.getRoleName(),role.getDepartmentId(),role.getEmployeeId());
         rolee.updateRole(role);
         return "success";
     }
       
       
     
}
