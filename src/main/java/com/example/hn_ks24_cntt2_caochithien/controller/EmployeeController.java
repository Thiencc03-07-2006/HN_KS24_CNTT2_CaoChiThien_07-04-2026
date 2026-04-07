package com.example.hn_ks24_cntt2_caochithien.controller;

import com.example.hn_ks24_cntt2_caochithien.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public String list(Model model) {
        model.addAttribute("employees", List.of(
                new Employee(1, "Nguyen Van A", "Nhan su", 10000000D),
                new Employee(2, "Nguyen Van B", "Nhan su", 20000000D),
                new Employee(3, "Nguyen Van C", "Nhan su", 30000000D)
        ));
        return "employee-list";
    }
}
