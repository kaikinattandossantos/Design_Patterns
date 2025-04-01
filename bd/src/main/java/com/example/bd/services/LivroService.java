package com.example.bd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bd.entity.Livro;
import com.example.bd.repository.LivroRepository;

@Service // 👈 Anotação essencial para serviços Spring
public class LivroService { // Remove "implements LivroRepository"

    @Autowired // 👈 Injeção do repositório
    private LivroRepository livroRepository;

    // Exemplo de método de serviço
    public List<Livro> buscarTodosLivros() {
        return livroRepository.findAll(); // Usa o repositório
    }
    
    public Livro salvarLivro(Livro livro) {
        return livroRepository.save(livro);
    }
    
    // Adicione outros métodos de negócio aqui
}