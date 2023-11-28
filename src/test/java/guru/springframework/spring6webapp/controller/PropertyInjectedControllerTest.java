package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tell JUnit that I want Spring Context to be loaded
 * When Spring Context runs -> it will look at the default application context as it's configured
 */
@SpringBootTest
class PropertyInjectedControllerTest {
    @Autowired
    private PropertyInjectedController propertyInjectedController;

    @Test
    void sayHello() {
        assertThat(propertyInjectedController.sayHello()).isEqualTo("Hello Everyone from Base Service!");
    }


}