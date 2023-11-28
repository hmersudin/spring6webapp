package guru.springframework.spring6webapp.service.env;

import guru.springframework.spring6webapp.service.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatEnvironmentService implements EnvironmentService {

    @Override
    public String getDatasource() {
        return "User Acceptance Testing Environment!";
    }
}
