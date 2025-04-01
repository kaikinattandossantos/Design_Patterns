package com.example.bd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bd.entity.Livro;
import com.example.bd.repository.LivroRepository;

@Service 
public class LivroService { 

    @Autowired 
    private LivroRepository livroRepository;

    public List<Livro> buscarTodosLivros() {
        return livroRepository.findAll(); 
    }
    
    public Livro salvarLivro(Livro livro) {
        return livroRepository.save(livro);
    }
    
}