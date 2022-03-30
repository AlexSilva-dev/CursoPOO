/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapratica12;

/**
 *
 * @author alex
 */
public class Ave extends Animal{

    private String corPena;
    //metodos
    public void contruirNinho(){
        System.out.println("Construiu um ninho");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo fruta");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
