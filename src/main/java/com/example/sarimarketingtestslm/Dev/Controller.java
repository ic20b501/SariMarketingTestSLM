package com.example.sarimarketingtestslm.Dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api")
    public String GetGrade(@RequestParam int percentage)
    {
        if (percentage >= 88)
            return "1";
        if ((percentage >= 75) && (percentage < 88))
            return "2";
        if ((percentage >= 63) && (percentage < 75))
            return "3";
        if ((percentage >= 50) && (percentage < 63))
            return "4";
        if (percentage < 50)
            return "5";
        if (percentage > 100)
            return "error wrong input value | please make a input between 0-100 as this is in percent";
        else
            return "error wrong input value | please make a input between 0-100 as this is in percent";
    }
}
