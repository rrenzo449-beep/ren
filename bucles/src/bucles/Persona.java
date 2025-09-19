/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author Lab111Pc02
 */
// Creacion de una clase que es Persona
public class Persona {
    // Asignamos atributos (caracteristicas)
    String nombre;
    int edad;   
    // Método (Accion)
    void saludar() {
        System.out.println("Hola, mi nombre es " +nombre+ " y tengo " +edad+ " anios.");
    }
    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Creacion de un objeto de la calse Persona
        Persona p = new  Persona(); // Crear objeto
        // Asignamos valores a los atributos
        p.nombre = "Jhonatan";
        p.edad = 20;
        //llamamos al metodo saludar 
        p.saludar();    
    }
}
