package com.example.hn_ks24_cntt2_caochithien.controller;

import com.example.hn_ks24_cntt2_caochithien.model.Employee;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public String list(Model model) {
        model.addAttribute("employees", List.of(
                new Employee(1, "Nguyen Van A", "nhan su", 10000000D),
                new Employee(2, "Nguyen Van B", "nhan su", 20000000D),
                new Employee(3, "Nguyen Van C", "nhan su", 30000000D)
        ));
        return "employee-list";
    }
}
