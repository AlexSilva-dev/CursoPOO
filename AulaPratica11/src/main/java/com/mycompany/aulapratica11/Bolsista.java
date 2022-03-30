/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapratica11;

/**
 *
 * @author alex
 */
public class Bolsista extends Aluno{
    private int bolsa;
    //metodos
    public void renovarBolsa(){
        
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("\nPagando mensalidade do bolsista " + this.getNome());
    }
    

    

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    
}
