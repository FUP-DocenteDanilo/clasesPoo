/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author posgrados
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una instancia de Producto
        Producto p1=new Producto(001,"Consola Xbox",1500000);
        // Obtener Precio del Producto
        System.out.println("El precio del "+p1.getNombre()+" es: "+p1.getPrecio());
        // Calcular el Total para 3 unidades
        int cantidad = 3;
        double total = p1.calcularTotal(cantidad);
        System.out.println("El total para "+cantidad+ "unidades de "+p1.getNombre()+" es: "+total);
    }
    
}
