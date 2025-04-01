package com.example.bd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bd.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> { 

    List<Livro> findByAutor(String autor);
    List<Livro> findByLido(boolean lido);
    List<Livro> findByAutorAndNome(String autor, String nome);

}
