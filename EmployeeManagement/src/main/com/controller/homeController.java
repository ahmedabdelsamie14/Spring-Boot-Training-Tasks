package main.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/")
    public String homePage()
    {
        return "homePage";
    }

    @RequestMapping("/showAddEmployee")
    public String showAddEmployeePage()
    {
        return "employeeForm";
    }
}
