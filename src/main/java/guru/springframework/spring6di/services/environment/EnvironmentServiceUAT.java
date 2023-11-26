package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
//@Service("datasource")
@Service
public class EnvironmentServiceUAT implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "UAT";
    }
}
