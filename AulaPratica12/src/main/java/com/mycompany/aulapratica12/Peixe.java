/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapratica12;

/**
 *
 * @author alex
 */
public class Peixe extends Animal {
    private String corEscama;
    
    //metodos

    public void soutarBolha(){
        System.out.println("Soltou uma bolha");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe n faz som");
    }

    @Override
    public void alimentar() {
        System.out.println("Come substancias");
    }

    @Override
    public void locomover() {
        System.out.println("Peixe não faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
