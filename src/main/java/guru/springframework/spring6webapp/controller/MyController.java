package guru.springframework.spring6webapp.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("I am in the Controller.");
        return "Hello Everyone from MyController";
    }
}
