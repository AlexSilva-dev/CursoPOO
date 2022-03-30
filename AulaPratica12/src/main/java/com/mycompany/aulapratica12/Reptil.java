/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapratica12;

/**
 *
 * @author alex
 */
public class Reptil extends Animal {
    private String corEscama;
    
    //metodos
    
    @Override
    public void locomover(){
        System.out.println("rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais");
    }
    
    public void emitirSom(){
        System.out.println("Som de repitil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
     
    
}
