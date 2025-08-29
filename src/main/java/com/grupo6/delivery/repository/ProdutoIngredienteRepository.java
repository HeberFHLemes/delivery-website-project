package com.grupo6.delivery.repository;

import com.grupo6.delivery.model.ProdutoIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoIngredienteRepository extends JpaRepository<ProdutoIngrediente, Long> {
}