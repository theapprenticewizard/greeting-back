package io.github.theapprenticewizard.testingintellij.controllers;

import io.github.theapprenticewizard.testingintellij.models.GreetingBean;
import io.github.theapprenticewizard.testingintellij.services.RandomGreetingService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GreetingControllerTest {
    private GreetingController greetingController;

    private GreetingBean greetingBean;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    RandomGreetingService randomGreetingServiceMock;

    @Before
    public void setUp() throws Exception {
        greetingController = new GreetingController(randomGreetingServiceMock);
        greetingBean = new GreetingBean();
        greetingBean.setGreeting("hello");
    }

    @Test
    public void greet() throws Exception {
        when(randomGreetingServiceMock.generateGreeting()).thenReturn(greetingBean);
        assertThat(greetingController.greet().getGreeting(), is("hello"));
    }

}