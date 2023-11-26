package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    // If we autowire the property - dependency injection happens via reflection - which is slow
    // We do not want that - instead we add the @Autowired to the setGreetingService - so we do NOT
    // use reflection
    //@Autowired
    private GreetingService greetingService;

    // Need to add Autowired to the setter for the setter to be utilized for dependency injection by spring
    // Overriding which service to inject via @Qualifier("overridenBeanName")
    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Setter being called by Spring");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
