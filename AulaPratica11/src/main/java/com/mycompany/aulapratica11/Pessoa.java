/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapratica11;

/**
 *
 * @author alex
 */
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //metodo
    public void fazerAniver(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String toString(){
        return "nome= " + nome + ", idade= " + idade + ", sexo= " + sexo;
    }
    
    
}
