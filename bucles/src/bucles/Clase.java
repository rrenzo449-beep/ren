/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author Lab111Pc02
 */
public class Clase {
    // Definimos la clase Persona dentro
    static class Persona {
        String nombre;
        int edad;
        
        void saludar() {
            System.out.println("Hola, mi nombre es " +nombre+ " y tengo " +edad+ " años.");
        }
    }
    public static void main(String[] args) {
        Persona p = new  Persona(); // Crear objeto 
        p.nombre = "Jhonatan";
        p.edad = 20;
        p.saludar();    // Llamamos al metodo saludar
    }
}   

        
        
