package guru.springframework.spring6webapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    private SetterInjectedController setterInjectedController;

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
//        assertThat(setterInjectedController.sayHello()).isEqualTo("Hello Everyone from Base Service!");
    }
}