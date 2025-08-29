package com.grupo6.delivery.dto;

import java.util.List;

public record ProdutoDTO(
        String nome,
        Double preco,
        String imagem,
        String descricao,
        List<IngredienteDTO> ingredientes) {
}