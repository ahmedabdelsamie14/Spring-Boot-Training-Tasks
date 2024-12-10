package main.com.model;

import lombok.Getter;
import lombok.Setter;


public class Employee {
    private String empName;
    private String empDepartment;
    private String empEmail;

    public Employee() {

    }
    public Employee(String empName, String empDepartment, String empEmail) {
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empEmail = empEmail;
    }


    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}
