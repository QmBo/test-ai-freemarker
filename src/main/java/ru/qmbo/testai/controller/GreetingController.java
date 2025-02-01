package ru.qmbo.testai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class GreetingController {

    @GetMapping("/")
    public String showGreetingForm() {
        log.info("Accessing greeting form page");
        return "greeting";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam("name") String name, Model model) {
        log.info("Processing greeting for name: {}", name);
        model.addAttribute("name", name);
        return "hello";
    }
}