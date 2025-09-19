/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;

/**
 *
 * @author Lab111Pc02
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner scanner = new Scanner(System.in);
        // Bucle For
        System.out.println("Bucle for");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("El numero par es: " +i);
        }
        
        // Bucle while
        // El usuario crea una contraseña
        System.out.println("Crea una nueva contrasenia");
        String nuv_contraseña = scanner.nextLine();
        // Ahora se le pide que la escriba para verificar
        String intento = "";
        while (!intento.equals(nuv_contraseña)) {
            System.out.print("Ingrese la contrasenia: ");
            intento = scanner.nextLine();
        if (!intento.equals(nuv_contraseña)) {
            System.out.println("Contraseña incorrecta. Intenta de nuevo.");
            }
        }
        System.out.println("Contrasenia correcta! Acceso permitido.");
        
        // Bucle do_while 
        int i = 1;
        do {
            System.out.println("Numero: " + i);
            i++;
        } while (i <= 5);
    }
}

