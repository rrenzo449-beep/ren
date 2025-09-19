    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author Lab111Pc02
 */
public class Instancia {
    String nombre;
    int edad;
    
    void saludar() {
        System.out.println("Hola, mi nombre es " +nombre+ " y tengo " +edad+ " anios.");
    }
    public static void main(String[] args) {
        // Creacion de una (instancia) con 2 objetos de la clase Persona
        Persona p1 = new  Persona(); // Creación del primero objeto
        Persona p2 = new  Persona(); // Creación del primero objeto
        // Asignamos valores a cada objeto
        p1.nombre = "Jhonatan";
        p1.edad = 20;
        p2.nombre = "Jose";
        p2.edad = 19;
        //llamamos al metodo saludar de cada uno
        p1.saludar();    // Llamamos al metodo saludar
        p2.saludar();
    }
}
