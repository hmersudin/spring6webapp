package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.service.GreetingService;
import guru.springframework.spring6webapp.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
   PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        assertThat(propertyInjectedController.sayHello()).isEqualTo("Hello Everyone from Base Service!");
    }


}