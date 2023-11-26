package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        // set service manually to a concrete implementation - what we are doing is very rigid.
        // We are creating a dependency here on the greeting service, but internal to the controller.
        // So the controller has all the control as to how that greeting service is created and how it is
        // managed, so right now this controller does not play nice with spring framework.
        // This is not the way we want to be doing things - but I wanted to show you the concept here, where we
        // are taking an external dependency that is going to be giving us a greeting, and this is one way you might
        // do it without the Spring Framework and without using dependency injection.
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the Controller");
        return greetingService.sayGreeting();
    }
}
