package role;
// Generated Dec 18, 2014 9:57:35 AM by Hibernate Tools 3.6.0



/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


     private String employeeId;
     private String departmentId;
     private String roleName;
     private String password;

    public Role() {
    }

    public Role(String employeeId, String departmentId, String roleName) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.roleName = roleName;
    }

	
    public Role(String employeeId) {
        this.employeeId = employeeId;
    }
    public Role(String employeeId, String departmentId, String roleName, String password) {
       this.employeeId = employeeId;
       this.departmentId = departmentId;
       this.roleName = roleName;
       this.password = password;
    }
   
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


