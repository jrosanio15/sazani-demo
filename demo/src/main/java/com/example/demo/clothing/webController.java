package com.example.demo.clothing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {

    @GetMapping("/")
    public String index() {
        // Return the name of the HTML file (index.html)
        return "index";
    }

    @GetMapping("/addClothing")
    public String addClothing() {
        return "addClothing";
    }
    
}
