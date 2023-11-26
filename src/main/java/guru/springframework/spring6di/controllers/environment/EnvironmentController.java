package guru.springframework.spring6di.controllers.environment;

import guru.springframework.spring6di.services.environment.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService dataSourceService) {
        this.environmentService = dataSourceService;
    }

    public String getEnvironment() {
        return "You are in " + environmentService.getEnvironment() + " Environment";
    }
}
