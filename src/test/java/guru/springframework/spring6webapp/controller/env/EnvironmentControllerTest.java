package guru.springframework.spring6webapp.controller.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("qa")
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    private EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}