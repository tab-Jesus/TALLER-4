/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller4.EJ2;

/**
 *
 * @author JESUS DAVID
 */
public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        
        this.modelo = modelo;
        
        setVelocidadMaxima(velocidadMaxima);
 }

    public String getMarca() {
        return marca;
  }

    public String getModelo() {
        return modelo;
 }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
 }

    public void setMarca(String marca) {
        this.marca = marca;
  }

    public void setModelo(String modelo) {
        this.modelo = modelo;
  }

    public void setVelocidadMaxima(double velocidadMaxima) {
      if (velocidadMaxima >= 0) {
       this.velocidadMaxima = velocidadMaxima;
 }
  }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
 }
   }
}


