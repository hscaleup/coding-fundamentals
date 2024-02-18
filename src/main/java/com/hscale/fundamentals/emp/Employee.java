package com.hscale.fundamentals.emp;

/**
 * @author Abhishek Kumar on 16/02/2024
 */
public class Employee {
    private String empFirstname;
    private String empLastname;
    private long empId;
    private int age;
    private String department;

    public Employee(String empFirstname, String empLastname, long empId, int age, String department) {
        this.empFirstname = empFirstname;
        this.empLastname = empLastname;
        this.empId = empId;
        this.age = age;
        this.department = department;
    }

    public void setEmpFirstname(String empFirstname) {
        this.empFirstname = empFirstname;
    }

    public void setEmpLastname(String empLastname) {
        this.empLastname = empLastname;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmpFirstname() {
        return empFirstname;
    }

    public String getEmpLastname() {
        return empLastname;
    }

    public long getEmpId() {
        return empId;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empFirstname='" + empFirstname + '\'' +
                ", empLastname='" + empLastname + '\'' +
                ", empId=" + empId +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
