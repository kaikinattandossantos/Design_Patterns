package com.example.bd.repository;

import com.example.bd.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LivroRepository extends JpaRepository<Livro, Long> { 

    List<Livro> findByAutor(String autor);
    List<Livro> findByLido(boolean lido);
    List<Livro> findByAutorAndLivro(String autor, String nome);

}
