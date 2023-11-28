package guru.springframework.spring6webapp.controller.env;

import guru.springframework.spring6webapp.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    @Autowired
    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return environmentService.getDatasource();
    }
}
