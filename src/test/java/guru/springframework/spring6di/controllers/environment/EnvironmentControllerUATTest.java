package guru.springframework.spring6di.controllers.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class EnvironmentControllerUATTest {

    @Autowired
    EnvironmentController dataSourceController;

    @Test
    void getEnvironment() {
        System.out.println(dataSourceController.getEnvironment());
    }
}