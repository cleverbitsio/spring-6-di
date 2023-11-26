package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;


// When you annotate a class with Spring annotations,
// Spring names its beans with the class name but lower case for first character
// So using @Service on GreetingServicePropertyInjected, means the bean is called greetingServicePropertyInjected
// However, we can override the default bean name as so @Service("overridenBeanName")
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!!";
    }
}
