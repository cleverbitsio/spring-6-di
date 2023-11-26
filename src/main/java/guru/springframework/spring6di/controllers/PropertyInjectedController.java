package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // With properties, Spring uses Dependency Injection via reflection - which is slow
    // Overriding which service to inject via @Qualifier("overridenBeanName")
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
