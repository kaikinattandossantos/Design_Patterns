package com.example.bd.controller;

import com.example.bd.entity.Livro;
import com.example.bd.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController { 

    @Autowired
    private LivroRepository repository;

    
    @GetMapping("/autor/{autor}") 
    public List<Livro> buscarPorAutor(@PathVariable String autor) {
        return repository.findByAutor(autor);
    }


    @GetMapping
    public List<Livro> listarTodos() { 
        return repository.findAll();
    }
}