/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacestarea;

/**
 *
 * @author Tato
 */
public class Bicicleta implements vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La bicicleta está en movimiento.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se ha detenido.");
    }
}