package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        // mimicking what Spring would do
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        assertThat(constructorInjectedController.sayHello()).isEqualTo("Hello Everyone from Base Service!");

    @Test
    void sayHelloFromPrimary() {
        assertThat(constructorInjectedController.sayHello()).isEqualTo("Hello Everyone from the Primary Bean!");

    }
}