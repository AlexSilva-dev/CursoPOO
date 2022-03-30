
package com.mycompany.aulapratica3;

/**
 *
 * @author alex
 */
public class Caneta {
    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
    }
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    
    //Metodos
    public void status(){
        System.out.println("É essa caneta é;            "+ this.getModelo());
        System.out.println("É essa caneta é;            "+ this.getCor());
        System.out.println("É essa caneta tem a ponta;  "+ this.getPonta());
        //System.out.println("É essa caneta tem carga;    "+ this.getCarga());
        System.out.println("É essa caneta está tampada? "+ this.getTampada());
    }
    
    public void tampar(){
        this.setTampada(true);
    }
    public void destampar(){
        this.setTampada(false);
    }
    
    
    
    public boolean getTampada(){
        return tampada;
    }
    private void setTampada(boolean t){
        this.tampada = t;
    }
    
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    
    public String getCor(){
        return cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
}
