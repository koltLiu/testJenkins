package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("hello/{str}")
    public String hello(@PathVariable String str){
        String ss = "122223";

        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.HOUR_OF_DAY);
        return "hello:"+str;
    }

    @GetMapping("hello2/{str}")
    public String hello2(@PathVariable String str){
        return "hello:"+str;
    }
}
