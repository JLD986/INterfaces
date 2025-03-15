/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacestarea;

/**
 *
 * @author Tato
 */
public class Perro implements AnimalInterface {
    @Override
    public void hacerSonido() {
        System.out.println("El perro está ladrando.");
    }

    @Override
    public void mover() {
        System.out.println("El perro está corriendo.");
    }
}
