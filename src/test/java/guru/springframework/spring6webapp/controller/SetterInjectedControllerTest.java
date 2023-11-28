package guru.springframework.spring6webapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

    @Test
    void sayHello() {
        assertThat(setterInjectedController.sayHello()).isEqualTo("Hello Everyone from Base Service!");
    }
}