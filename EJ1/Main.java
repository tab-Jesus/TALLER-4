/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller4.EJ1;

/**
 *
 * @author JESUS DAVID
 */
public class Main {
    public static void main(String[] args) {
        
        
        Estudiante estudiante = new Estudiante("JESUS", 18, 3.0);

        
        System.out.println("Nombre: " + estudiante.getNombre());
        
        System.out.println("Edad: " + estudiante.getEdad());
        
        System.out.println("Nota de la U: " + estudiante.getNotaPromedio());

      
    }
}
