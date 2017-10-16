package io.github.theapprenticewizard.testingintellij.models;

import java.io.Serializable;

public class GreetingBean implements Serializable {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "GreetingBean{" +
                "greeting='" + greeting + '\'' +
                '}';
    }
}
