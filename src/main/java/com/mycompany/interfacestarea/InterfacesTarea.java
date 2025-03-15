/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacestarea;

/**
 *
 * @author Tato
 */
public class InterfacesTarea {
    public static void main(String[] args) {
        // Crear un objeto de la clase Perro
        AnimalInterface perro = new Perro();
        perro.hacerSonido(); // Salida: El perro está ladrando.
        perro.mover();       // Salida: El perro está corriendo.

        // Crear un objeto de la clase Gato
        AnimalInterface gato = new Gato();
        gato.hacerSonido(); // Salida: El gato está maullando.
        gato.mover();       // Salida: El gato está saltando.
    }
}