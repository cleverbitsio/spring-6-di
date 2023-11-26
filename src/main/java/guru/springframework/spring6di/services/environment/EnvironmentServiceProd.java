package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
//@Service("datasource")
@Service
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "PROD";
    }
}
