/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapratica09;

/**
 *
 * @author alex
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodos
    
    public String detalhes(){
        return "Livro{" + "titulo = " + this.titulo + ", autor = " + this.autor + ", total de pag = " + this.totalPag 
                + ". pag Atual = " + this.pagAtual + " aberto = " + this.aberto + ", leitor = " + this.leitor.getNome() + "}";
    }
    
    //
    
    public Livro(String titulo, String autor, int totalPag, Pessoa l) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = l;
    }

    //
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folear(int quantas) {
        this.setPagAtual(this.getPagAtual() + quantas);

    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
            this.setPagAtual(this.getPagAtual() - 1);

    }
    
    
}
