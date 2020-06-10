package daniel.varga.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
