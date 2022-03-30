/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.projetofinal;

/**
 *
 * @author alex
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        
        
        
        v[0] = new Video("Aula  1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        /*
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        */
        g[0] = new Gafanhoto("Alex", 20, "M", "alex123");
        g[1] = new Gafanhoto("Andreza", 21, "F", "andreza.oliver");
        
        /*
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
        
        Visualizacao vis = new Visualizacao(g[0], v[2]);
        Visualizacao vis1 = new Visualizacao(g[1], v[2]);
        vis.avaliar(8);
        vis1.avaliar(9.0f);
        System.out.println(vis.toString());
        
    }
}
