package guru.springframework.spring6webapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    private ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
//        assertThat(constructorInjectedController.sayHello()).isEqualTo("Hello Everyone from Base Service!");
    }

    @Test
    void sayHelloFromPrimary() {
        assertThat(constructorInjectedController.sayHello()).isEqualTo("Hello Everyone from the Primary Bean!");

    }
}