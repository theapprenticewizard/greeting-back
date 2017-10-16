package io.github.theapprenticewizard.testingintellij.controllers;

import io.github.theapprenticewizard.testingintellij.models.GreetingBean;
import io.github.theapprenticewizard.testingintellij.services.RandomGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private final RandomGreetingService randomGreetingService;

    @Autowired
    public GreetingController(final RandomGreetingService randomGreetingService) {
        this.randomGreetingService = randomGreetingService;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @RequestMapping(value = "/api/greet", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public GreetingBean greet() {
        return randomGreetingService.generateGreeting();
    }
}
