package de.shingiro.mockwithjunit.services;

import de.shingiro.mockwithjunit.interfaces.CalculatorService;

/**
 * Created by a.shingiro on 22.03.2017.
 */
public class MathApplication {

    // calculator service instance
    private CalculatorService calculatorService;

    // service setter method
    public void setCalculatorService( CalculatorService calculatorService ) {
        this.calculatorService = calculatorService;
    }

    public double add( double x, double y ) {
        return calculatorService.addition( x, y );
    }

    public double substract( double x, double y ) {
        return calculatorService.substraction(x, y);
    }

    public double multiply( double x, double y) {
        return calculatorService.multiplication(x, y);
    }

    public double divide( double x, double y ) {
        if( y == 0 ) {
            System.err.println("Division by zero not allowed");
            return 0;
        }
        else {
            return calculatorService.division(x, y);
        }
    }
}
