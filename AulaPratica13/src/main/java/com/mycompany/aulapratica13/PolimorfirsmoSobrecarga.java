 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.aulapratica13;

/**
 *
 * @author alex
 */
public class PolimorfirsmoSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Cachorro c = new Cachorro();
        c.reagir("Ola");
        c.reagir("oi");
        c.reagir(false);
        c.reagir(11, 45);
        c.reagir(17, 4.5f);
    }
}
