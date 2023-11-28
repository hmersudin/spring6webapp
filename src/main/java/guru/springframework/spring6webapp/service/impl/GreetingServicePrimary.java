package guru.springframework.spring6webapp.service.impl;

import guru.springframework.spring6webapp.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from the Primary Bean!";
    }
}
