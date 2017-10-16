package io.github.theapprenticewizard.testingintellij.services;

import io.github.theapprenticewizard.testingintellij.models.GreetingBean;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGreetingServiceImpl implements RandomGreetingService {

    @Override
    public GreetingBean generateGreeting() {
        GreetingBean greeting = new GreetingBean();
        Random random = new Random();
        int greetingNumber = random.nextInt(5);

        if (greetingNumber == 0) greeting.setGreeting("Who's there?");
        if (greetingNumber == 1) greeting.setGreeting("Why hello there");
        if (greetingNumber == 2) greeting.setGreeting("What's up?");
        if (greetingNumber == 3) greeting.setGreeting("How's it going?");
        if (greetingNumber == 4) greeting.setGreeting("What's going on?");
        if (greetingNumber == 5) greeting.setGreeting("How's it?");

        System.out.println(greetingNumber + " reponse: " + greeting.getGreeting());

        return greeting;
    }
}
