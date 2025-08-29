package com.grupo6.delivery.mapper;

import com.grupo6.delivery.dto.ProdutoDTO;
import com.grupo6.delivery.model.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProdutoMapper {

    private final IngredienteMapper ingredienteMapper;

    public ProdutoDTO toDTO(Produto produto){
        return new ProdutoDTO(
                produto.getNome(),
                produto.getPreco(),
                produto.getImagem(),
                produto.getDescricao(),
                ingredienteMapper.toListDTO(produto.getProdutoIngrediente())
        );
    }
}
