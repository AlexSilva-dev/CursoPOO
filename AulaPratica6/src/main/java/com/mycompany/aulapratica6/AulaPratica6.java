/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.aulapratica6;

/**
 *
 * @author alex
 */
public class AulaPratica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        ControleRemoto c1 = new ControleRemoto();
        c1.abrirMenu();
        c1.ligar();
        c1.play();
        c1.abrirMenu();
    }
}
