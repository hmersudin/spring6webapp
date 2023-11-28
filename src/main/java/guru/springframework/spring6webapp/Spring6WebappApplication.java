package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6WebappApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring6WebappApplication.class, args);
		MyController controller = context.getBean(MyController.class);

		System.out.println("I am in the Main method.");
		System.out.println(controller.sayHello());
	}

}
