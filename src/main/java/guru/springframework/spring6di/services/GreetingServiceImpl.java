package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

// adding spring annotations for di
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello everyone from base service";
    }
}
