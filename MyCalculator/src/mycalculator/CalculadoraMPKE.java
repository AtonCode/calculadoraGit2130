package mycalculator;

public class CalculadoraMPKE implements ICalculator{

	@Override
	public double add(double a, double b) {
		// Se retorna la suma de los dos numeros
		return a+b;
	}

	@Override
	public double multiply(double a, double b) {
		// Se retorna la multiplicacion de los dos numeros
		return a*b;
	}

	@Override
	public double divide(double a, double b) throws ArithmeticException {
		// Excepci�n para divisi�n con cero
		if(b==0) {
			throw new ArithmeticException("Error, no se puede dividir por 0");
		}
		// Se retorna la divisi�n de los dos numeros
		return a/b;
	}

	@Override
	public double substract(double a, double b) {
		// Se retona la resta de los dos numeros
		return a-b;
	}
	
	
	@Override
	public String about() {
		// Retorna el autor de la calculadora
		return "Calculator implemented by << " + Authors.MPKE + " >>";
	}
	

	
}
