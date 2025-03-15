/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacestarea;

/**
 *
 * @author Tato
 */
public class Coche implements vehiculo {
    @Override
    public void arrancar() {
        System.out.println("El coche está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido.");
    }
}
