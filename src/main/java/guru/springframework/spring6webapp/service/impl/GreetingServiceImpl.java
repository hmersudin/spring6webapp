package guru.springframework.spring6webapp.service.impl;

import guru.springframework.spring6webapp.service.GreetingService;
import org.springframework.stereotype.Service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service!";
    }
}
