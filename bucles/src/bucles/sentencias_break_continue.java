/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
//import java.util.Scanner;
/**
 *
 * @author Lab111Pc02
 */
public class sentencias_break_continue {
    public static void main(String[] args) {
        // Sentencia break  
        // bucle que cuenta del 1 al 10
        for (int i = 1; i <= 10; i++) {
        //Si el número es 5, salimos del bucle
        if (i == 5) {
            System.out.println("Me encontre con el numero 5! Salgo del bucle.");
            break; //Sale del bucle cuando i es 5
        }
        // Sentencia continue
        // Si el numero es par, lo salta
        if (i % 2 == 0) {
            continue; // Salta la impresion del numero 3
        }
        // Solo imprime los numeros impares antes del 4
        System.out.println("Numero: " +i);
        }
    }   
}
