/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2hue;

/**
 *
 * @author felix
 */
public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator(CalculationOperation add, CalculationOperation substract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, substract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number n = new Number();
        n.setA(a.getA() + b.getA());
        n.setB(a.getB() + b.getB());
        return n;
    }

    @Override
    public Number substract(Number a, Number b) {
        Number n = new Number();
        n.setA(a.getA() - b.getA());
        n.setB(a.getB() - b.getB());
        return n;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number n = new Number();
        n.setA(a.getA() * b.getA());
        n.setB(a.getB() * b.getB());
        return n;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number n = new Number();
        n.setA(a.getA() / b.getA());
        n.setB(a.getB() / b.getB());
        return n;

    }

}
