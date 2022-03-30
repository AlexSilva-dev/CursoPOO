/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapratica6;

/**
 *
 * @author alex
 */
public class ControleRemoto implements Controlador{
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
    }
    
    //Metodos

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if(this.isLigado() == false){
            this.setLigado(true);
            System.out.println("Ligando");
        }
        
    }

    @Override
    public void desligar() {
        if(this.isLigado() == true){
            this.setLigado(false);
            System.out.println("Desligando");
        }
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta tocando? " + this.isTocando());
        System.out.println("Volume : " + this.getVolume());
        for(int i = 0; i<= this.getVolume(); i+= 10){
            System.out.print("[]");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
        
    }

    @Override
    public void maisVol() {
        if(this.isLigado() == true){
            if(this.getVolume() <= 100){
                this.setVolume(5 + this.getVolume());
            }else{
                System.out.println("Volume no máximo");
            }
        }
        
    }

    @Override
    public void menosVol() {
         if(this.isLigado() == true){
            if(this.getVolume() >= 100){
                this.setVolume(5 - this.getVolume());
            }else{
                System.out.println("Volume no mínimo");
            }
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() == true && this.getVolume() != 0){
            this.setVolume(0);
        }
    }
        
    

    @Override
    public void desligarMudo() {
        if(this.isLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() == true && this.isTocando() == false){
            this.setTocando(true);
            System.out.println("Tocando...");
        }
        
    }

    @Override
    public void pause() {
        if(this.isLigado() == true && this.isTocando() == true){
            this.setTocando(false);
        }
        
    }
    
}
