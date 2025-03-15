/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacestarea;

/**
 *
 * @author Tato
 */
public class Gato implements AnimalInterface {
    @Override
    public void hacerSonido() {
        System.out.println("El gato está maullando.");
    }

    @Override
    public void mover() {
        System.out.println("El gato está saltando.");
    }
}