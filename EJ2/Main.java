/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller4.EJ2;

/**
 *
 * @author JESUS DAVID
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        
        Coche coche = new Coche("Kia", "Picanto", 100);

        System.out.println("Marca: " + coche.getMarca());
        
        System.out.println("Modelo: " + coche.getModelo());
        
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());

       
    }
}