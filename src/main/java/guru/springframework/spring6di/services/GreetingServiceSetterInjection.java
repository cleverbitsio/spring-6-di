package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

// When you annotate a class with Spring annotations,
// Spring names its beans with the class name but lower case for first character
// So using @Service on GreetingServiceSetterInjection, means the bean is called greetingServiceSetterInjection
// However, we can override the default bean name as so @Service("overridenBeanName")
@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!";
    }
}
