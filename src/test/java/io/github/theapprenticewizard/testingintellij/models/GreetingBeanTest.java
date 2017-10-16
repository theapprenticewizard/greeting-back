package io.github.theapprenticewizard.testingintellij.models;

import org.junit.Test;
import org.meanbean.test.BeanTester;

public class GreetingBeanTest {

    @Test
    public void testBean() {
        new BeanTester().testBean(GreetingBean.class);
    }
}