/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinal;

/**
 *
 * @author alex
 */
public class Gafanhoto extends Pessoa {
    private String longin;
    private int totAssistido;
   
    //metodos
    
    public Gafanhoto(String nome, int idade, String sexo, String longin){
        super(nome, idade, sexo);
        this.longin = longin;
        this.totAssistido = 0;
        
    }

    public void viuMaisUm() {
    }

    public String getLongin() {
        return longin;
    }

    public void setLongin(String longin) {
        this.longin = longin;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "  longin=" + longin + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
}
