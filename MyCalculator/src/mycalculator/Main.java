/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author anmontero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create calculator implementation
        System.out.println("Git Calculator! Solar Team");

        // Alejandro Sacristan Leal -> ASL
        pruebaASL();



    }

    // Funcion Alejandro Sacristan Leal -> ASL
    public static void pruebaASL() {

        double a = 50;
        double b = 2;
        String AutorName= "Alejandro Sacristan Leal";

        CalculadoraASL asl = new CalculadoraASL(a, b, AutorName);

        System.out.println(" ");
        System.out.println(asl.about());
        System.out.println(a + " + " + b + " = " + asl.add());
        System.out.println(a + " - " + b + " = " + asl.substract());
        System.out.println(a + " * " + b + " = " + asl.multiply());
        System.out.println(a + " / " + b + " = " + asl.divide());
        System.out.println(" ");
    }
    
    

}
