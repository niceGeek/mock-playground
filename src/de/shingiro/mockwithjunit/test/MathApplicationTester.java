package de.shingiro.mockwithjunit.test;

import de.shingiro.mockwithjunit.interfaces.CalculatorService;
import de.shingiro.mockwithjunit.services.MathApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by a.shingiro on 22.03.2017.
 */

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    // @InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calculatorService;

    // the real test
    @Test
    public void testAdd() {
        // add the behavior of calculator service to add two numbers
        when( calculatorService.addition(10.0, 20.0) ).thenReturn(30.0);

        // test the add functionality
        assertEquals( mathApplication.add(10.0, 20.0), 30.0 );
    }
}
