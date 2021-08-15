package mycalculator;

public class CalculadoraASL implements ICalculator{

    private double a;
    private double b;
    private String Autor;

    public CalculadoraASL(double a, double b, String Autor) {
        this.a = a;
        this.b = b;
        this.Autor = Autor;
    }

    @Override
    public double add(){
        return this.a + this.b;
    }

    @Override
    public double multiply(){
        return this.a * this.b;
    }

    @Override
    public double divide(){
        return this.a / this.b;
    }

    @Override
    public double substract(){
        return this.a - this.b;
    }

    @Override
    public String about(){
        return "Calculadora implementada por " + this.Autor;
    }
}
