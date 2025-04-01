package com.example.bd.controller;

import com.example.bd.entity.Livro;
import com.example.bd.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController { // Nome mais descritivo

    @Autowired
    private LivroRepository repository;

    // Endpoint para buscar por autor
    @GetMapping("/autor/{autor}") // 👈 Define o padrão da URL
    public List<Livro> buscarPorAutor(@PathVariable String autor) {
        return repository.findByAutor(autor);
    }

    // Endpoint raiz melhorado
    @GetMapping
    public List<Livro> listarTodos() { // 👈 Retorna todos os livros
        return repository.findAll();
    }
}