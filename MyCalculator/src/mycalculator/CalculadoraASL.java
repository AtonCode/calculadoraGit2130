package mycalculator;

public class CalculadoraASL implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public String about() {
        return "Calculadora es implementada por : " + Authors.ASL;
    }
}
