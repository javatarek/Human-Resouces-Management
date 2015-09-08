package dao;
// Generated Dec 18, 2014 9:57:35 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private String employeeId;
     private String managerId;
     private String departmentId;
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private Date hireDate;
     private String jobId;
     private String salary;
     private String commissionPct;
     private String gender;
     private String city;
     private String jobGrade;
     private String departmentName;
     private String jobLocation;
     private String primarySkill;
     private String secondarySkill;

    public Employees(){
        
    }
     
    public Employees(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employees(String employeeId, String managerId, String departmentId, String jobId,String salary, String commissionPct) {
        this.employeeId = employeeId;
        this.managerId = managerId;
        this.departmentId = departmentId;
        this.jobId = jobId;
        this.salary=salary;
        this.commissionPct = commissionPct;
    }

	
    
    public Employees(String employeeId, String managerId, String departmentId, String firstName, String lastName, String email, String phoneNumber, Date hireDate, String jobId, String salary, String commissionPct, String gender, String city, String jobGrade, String departmentName, String jobLocation, String primarySkill, String secondarySkill) {
       this.employeeId = employeeId;
       this.managerId = managerId;
       this.departmentId = departmentId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.hireDate = hireDate;
       this.jobId = jobId;
       this.salary = salary;
       this.commissionPct = commissionPct;
       this.gender = gender;
       this.city = city;
       this.jobGrade = jobGrade;
       this.departmentName = departmentName;
       this.jobLocation = jobLocation;
       this.primarySkill = primarySkill;
       this.secondarySkill = secondarySkill;
    }
   
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getJobId() {
        return this.jobId;
    }
    
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    public String getSalary() {
        return this.salary;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getCommissionPct() {
        return this.commissionPct;
    }
    
    public void setCommissionPct(String commissionPct) {
        this.commissionPct = commissionPct;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getJobGrade() {
        return this.jobGrade;
    }
    
    public void setJobGrade(String jobGrade) {
        this.jobGrade = jobGrade;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getJobLocation() {
        return this.jobLocation;
    }
    
    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
    public String getPrimarySkill() {
        return this.primarySkill;
    }
    
    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }
    public String getSecondarySkill() {
        return this.secondarySkill;
    }
    
    public void setSecondarySkill(String secondarySkill) {
        this.secondarySkill = secondarySkill;
    }




}

