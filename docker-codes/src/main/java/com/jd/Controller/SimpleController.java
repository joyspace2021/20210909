package com.jd.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(value = "/index")
    public String simple(){
        return "Hello,Simple man,welcome to docker's world!";
    }
}
