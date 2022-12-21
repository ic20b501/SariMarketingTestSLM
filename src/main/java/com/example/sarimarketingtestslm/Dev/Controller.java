package com.example.sarimarketingtestslm.Dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api")
    public String GetGrade(@RequestParam int percentage)
    {
        if (percentage <= 80)
            return "1";
        else
            return "exception";
    }
}
