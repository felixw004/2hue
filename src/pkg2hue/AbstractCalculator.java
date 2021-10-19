/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2hue;

/**
 *
 * @author felix
 */
public abstract class AbstractCalculator {

    protected CalculationOperation add;
    protected CalculationOperation substract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {

    }

    public abstract Number add(Number a, Number b);

    public abstract Number substract(Number a, Number b);

    public abstract Number multiply(Number a, Number b);

    public abstract Number divide(Number a, Number b);

}
