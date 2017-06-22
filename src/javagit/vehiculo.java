/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagit;

public class vehiculo {

    /**
     * Función principal
     */
    int ruedas;
    private double velocidad = 0;
    String nombre;

    /**
     * Aumenta la velocidad
     */
    public void acelerar(double cantidad) {
        velocidad += cantidad;
    }

    /**
     * Disminuye la velocidad
     */
    public void frenar(double cantidad) {
        velocidad -= cantidad;
    }

    /**
     * Devuelve la velocidad
     */
    public double obtenerVelocidad() {
        return velocidad;
    }

    public static void main(String args[]) {
        vehiculo miCoche = new vehiculo();
        miCoche.acelerar(12);
        miCoche.frenar(5);
        System.out.println(miCoche.obtenerVelocidad());
    } // Da 7.0 
}