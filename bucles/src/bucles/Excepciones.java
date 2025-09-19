/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author Lab111Pc02
 */
public class Excepciones {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // Intentamos hacer una división
        try {
            int resultado = a / b; // Esto va a lanzar un error porque no se puede dividir entre 0 
            System.out.println("Resultado: " +resultado);
        }catch (ArithmeticException e) {
            // Este bloque se ejecuta si ocurre una excepción de tipo ArithmeticException
            System.out.println("Error: no se puede dividir entre cero");
        }
        // Este mensaje se ejecuta siempre, haya o no haya un error 
        System.out.println("Programa terminado correctamente.");
    }
}
