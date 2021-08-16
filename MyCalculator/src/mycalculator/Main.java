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
        // Juan Pablo Sanchez Gaitan -> JPSG
        pruebaJPSG();

        pruebaNDVO();
        //Nicolas Daniel Vargas Ortiz -> NDVO

    }

    // Funcion Alejandro Sacristan Leal -> ASL
    public static void pruebaASL() {



        CalculadoraASL asl = new CalculadoraASL();

        double a = 50;
        double b = 2;
        System.out.println(asl.about());
        System.out.println("Suma:" + a + " + " + b + " = " + asl.add(a, b));
        System.out.println("Resta" + a + " - " + b + " = " + asl.substract(a, b));
        System.out.println("Multiplicacion" + a + " * " + b + " = " + asl.multiply(a, b));
        System.out.println("Division" + a + " / " + b + " = " + asl.divide(a, b));
    }

    // funcion de juan pablo sanchez gaitan
    public static void pruebaJPSG() {

        CalculadoraJPSG jps = new CalculadoraJPSG();
        double a = 30;
        double b = 5;

        System.out.println(jps.about());
        System.out.println("Suma: " + a + " + " + b + " = " + jps.add(a, b));
        System.out.println("Resta: " + a + " - " + b + " = " + jps.substract(a, b));
        System.out.println("Multiplicacion: " + a + " * " + b + " = " + jps.multiply(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + jps.divide(a, b));
    }

    //Prueba Nicolas Vargas
    public static void pruebaNDVO() {

        CalculadoraNDVO NV = new CalculadoraNDVO();
        double a=12;
        double b=6;
        System.out.println("\n");

        System.out.println(NV.about());
        System.out.println(a + " + " + b + " = " + NV.add(a, b));
        System.out.println(a + " - " + b + " = " + NV.substract(a, b));
        System.out.println(a + " * " + b + " = " + NV.multiply(a, b));
        System.out.println(a + " / " + b + " = " + NV.divide(a, b));
    }

}
