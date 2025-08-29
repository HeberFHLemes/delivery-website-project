package com.grupo6.delivery.repository;

import com.grupo6.delivery.model.Produto;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @EntityGraph(attributePaths = {"produtoIngrediente", "produtoIngrediente.ingrediente"})
    //@Query(value = "SELECT * FROM produto p WHERE p.nome ILIKE %:nome%", nativeQuery = true)
    List<Produto> findByNomeContainingIgnoreCase(String nome);
}
