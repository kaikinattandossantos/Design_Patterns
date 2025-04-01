package com.example.bd.entity;

import jakarta.persistence.*;

@Entity
public class Livro {  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;  

    private String nome;
    private String autor;
    private String genero;
    private boolean lido;

    
    public Livro() {}

    
    public Livro(String nome, String autor, String genero, boolean lido) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.lido = lido;
    }

    
    public Long getNumero() { return numero; }
    public void setNumero(Long numero) { this.numero = numero; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public boolean isLido() { return lido; }
    public void setLido(boolean lido) { this.lido = lido; }
}
