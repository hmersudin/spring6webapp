package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Spring6WebappApplicationTests {

	// With @Autowired we say Spring context to inject ApplicationContext for us
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired // inject and ask for an instance of the controller
	private MyController myController;

	@Test
	void testAutowireOfController() {
		assertThat(myController.sayHello()).isEqualTo("Hello Everyone from MyController");
	}

	@Test
	void testGetControllerFromContext() {
		final MyController controller = applicationContext.getBean(MyController.class);
		assertThat(controller.sayHello()).isEqualTo("Hello Everyone from MyController");
	}

	@Test
	void contextLoads() {

	}

}
