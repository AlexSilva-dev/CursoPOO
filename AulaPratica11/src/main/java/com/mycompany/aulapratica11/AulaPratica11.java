/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.aulapratica11;

/**
 *
 * @author alex
 */
public class AulaPratica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        v1.setNome("Ana");
        v1.setIdade(22);
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Andreza");
        a1.setIdade(21);
        a1.setSexo("F");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Julio");
        b1.setIdade(19);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
    }
}
