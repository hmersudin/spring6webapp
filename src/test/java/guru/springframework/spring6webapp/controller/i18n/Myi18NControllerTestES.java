package guru.springframework.spring6webapp.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//When no "ES" profile is active, the "default" one will be used

//@ActiveProfiles("ES")
@SpringBootTest
class Myi18NControllerTestES {

    @Autowired
    private Myi18NController myi18NController;

    @Test
    void sayHello() {
        System.out.println(myi18NController.sayHello());
        // Test fails, because no "ES" profile is active, but instead it uses "default" which is "EN".
//        assertThat(myi18NController.sayHello()).isEqualTo("Hola Mundo - ES");
    }
}