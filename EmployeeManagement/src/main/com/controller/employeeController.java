package main.com.controller;

import main.com.model.Employee;
import main.com.services.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class employeeController {
    @Autowired
    private employeeService empService;

    @RequestMapping("/showAllEmployees")
    public String showAllEmployees(Model model) {
        List<Employee> employees = empService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "showAllEmployeesPage";
    }

    @RequestMapping(value = "/addEmployee" , method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute Employee employee) {
        empService.AddEmployee(employee);
        return "redirect:/showAllEmployees";
    }

    @RequestMapping(value = "/deleteEmployee")
    public String deleteEmployee(@RequestParam int index) {
        empService.removeEmployee(index);
        return "redirect:/showAllEmployees";
    }

    @RequestMapping(value = "/showEditEmployee")
    public String showEditEmployee(@RequestParam int index, Model model) {
        Employee employee = empService.getEmployeeByIndex(index);
        model.addAttribute("employee", employee);
        model.addAttribute("editMode" , true);
        model.addAttribute("index" , index);
        return "employeeForm";
    }

    @RequestMapping(value = "/editEmployee" , method = RequestMethod.POST)
    public String editEmployee(@ModelAttribute Employee employee , @RequestParam int index ,Model model)
    {
        empService.editEmployee(employee , index);
        return "redirect:/showAllEmployees";
    }
}
