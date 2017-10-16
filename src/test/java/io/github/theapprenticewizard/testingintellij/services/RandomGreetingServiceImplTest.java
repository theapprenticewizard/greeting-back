package io.github.theapprenticewizard.testingintellij.services;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class RandomGreetingServiceImplTest {
    private RandomGreetingServiceImpl randomGreetingService;

    @Before
    public void setUp() throws Exception {
        randomGreetingService = new RandomGreetingServiceImpl();
    }

    @Test
    public void generateGreeting() throws Exception {
        assertThat(randomGreetingService.generateGreeting().getGreeting().length(),
                greaterThan(0));
    }

}