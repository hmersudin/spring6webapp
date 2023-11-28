package guru.springframework.spring6webapp.service.env;

import guru.springframework.spring6webapp.service.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevEnvironmentService implements EnvironmentService {

    @Override
    public String getDatasource() {
        return "Development Environment!";
    }
}
