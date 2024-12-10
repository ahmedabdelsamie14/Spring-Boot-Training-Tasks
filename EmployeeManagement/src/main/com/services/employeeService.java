package main.com.services;

import main.com.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class employeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        System.out.println("Employee List: " + employeeList);
        return employeeList;
    }

    public Object AddEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Added Employee: " + employee);System.out.println("Added Employee: " + employee);
        return employee;
    }

    public void removeEmployee(int index) {
        if(index >= 0 && index < employeeList.size()){
            employeeList.remove(index);
        }
    }

    public void editEmployee(Employee employee , int index) {
        if(index >= 0){
            employeeList.set(index, employee);
        }
    }

    public Employee getEmployeeByIndex(int index) {
        if(index >= 0 && index < employeeList.size()){
            return employeeList.get(index);
        }
        return null;
    }

}
