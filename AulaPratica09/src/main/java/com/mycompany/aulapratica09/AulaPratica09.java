/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.aulapratica09;

/**
 *
 * @author alex
 */
public class AulaPratica09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa("Alex", 20, "Masculino");
        
        Livro l1 = new Livro("Aprendendo java", "João", 200, p1);
        System.out.println(l1.detalhes());
        l1.avancarPag();
        System.out.println(l1.detalhes());
        
    }
}
