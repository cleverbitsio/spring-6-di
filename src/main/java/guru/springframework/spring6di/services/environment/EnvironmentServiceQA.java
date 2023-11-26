package guru.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
//@Service("datasource")
@Service
public class EnvironmentServiceQA implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "QA";
    }
}
