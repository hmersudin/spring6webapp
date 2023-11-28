package guru.springframework.spring6webapp.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void testSayHello() {

        MyController controller = new MyController();
        assertThat(controller.sayHello()).isEqualTo("Hello Everyone from Base Service!");
    }
}