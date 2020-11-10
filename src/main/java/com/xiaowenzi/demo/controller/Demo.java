package com.xiaowenzi.demo.controller;

import com.xiaowenzi.demo.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Demo {

    @RequestMapping(value = "/entry/{name}")
    public String entry(@PathVariable("name") String name) {
        Map map = new HashMap();
        map.put("name", name);
        return "/index";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.say("yyyy");
        int age = person.getAge(28);
        System.out.println(age);
    }

}
