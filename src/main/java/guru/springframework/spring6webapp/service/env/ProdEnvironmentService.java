package guru.springframework.spring6webapp.service.env;

import guru.springframework.spring6webapp.service.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdEnvironmentService implements EnvironmentService {

    @Override
    public String getDatasource() {
        return "Production Environment!";
    }
}
