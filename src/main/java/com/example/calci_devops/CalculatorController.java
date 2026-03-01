package com.example.calci_devops;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/div")
    public int div(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }
}
