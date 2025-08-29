package com.grupo6.delivery.mapper;

import com.grupo6.delivery.dto.IngredienteDTO;
import com.grupo6.delivery.model.ProdutoIngrediente;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class IngredienteMapper {
    public List<IngredienteDTO> toListDTO(Set<ProdutoIngrediente> produtoIngredientes){
        return produtoIngredientes.stream()
                .map(pi -> new IngredienteDTO(
                        pi.getIngrediente().getNome(),
                        pi.getQuantidade(),
                        pi.getUnidadeMedida()
                )).toList();
    }
}
