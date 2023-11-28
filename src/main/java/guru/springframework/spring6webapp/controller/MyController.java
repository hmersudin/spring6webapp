package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.service.GreetingService;
import guru.springframework.spring6webapp.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am in the Controller.");
        return greetingService.sayGreeting();
    }
}
