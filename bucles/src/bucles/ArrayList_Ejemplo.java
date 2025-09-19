/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import java.util.ArrayList;
/**
 *
 * @author Lab111Pc02
 */
public class ArrayList_Ejemplo {
    public static void main(String[] args) {
        // Creación de una lista de nombres 
        ArrayList<String> nombres = new ArrayList<>();
        // Agregar elementos
        nombres.add("Carlos");
        nombres.add("Valeria");
        nombres.add("Juan");
    
        // Mostrar elementos
        for (String nombre : nombres) {
            System.out.println("Nombre: " +nombre);
        }
    
        // Eliminar un elemento
        nombres.remove("Valeria");
    
        // Mostrar lista después de eliminar
        System.out.println("\nDespues de eliminar: "); 
        for (String nombre : nombres) {
            System.out.println("Nombre: " +nombre); 
        }
    }
}
