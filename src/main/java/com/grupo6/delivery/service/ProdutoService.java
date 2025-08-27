package com.grupo6.delivery.service;

import com.grupo6.delivery.model.Ingrediente;
import com.grupo6.delivery.model.Produto;
import com.grupo6.delivery.model.TipoIngrediente;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProdutoService {

    public Produto[] mockProdutos(){
        return new Produto[]{
                new Produto("X-Tudo", 20.99d, Map.of(
                        new Ingrediente("Pão", TipoIngrediente.PAO, "UN"), 1d,
                        new Ingrediente("Carne", TipoIngrediente.CARNE, "g"), 200d,
                        new Ingrediente("Alface", TipoIngrediente.SALADA, "g"), 5d,
                        new Ingrediente("Tomate", TipoIngrediente.SALADA, "g"), 20d,
                        new Ingrediente("Molho da Casa", TipoIngrediente.MOLHO, "UN"), 1d,
                        new Ingrediente("Queijo", TipoIngrediente.LATICINIO, "UN"), 2d,
                        new Ingrediente("Cebola", TipoIngrediente.SALADA, "g"), 10d
                )),
                new Produto("Batata-Frita", 6.99d, Map.of(
                        new Ingrediente("Batata-Frita", TipoIngrediente.BATATA, "g"), 42.5d,
                        new Ingrediente("Ketchup", TipoIngrediente.MOLHO, "UN"), 1d,
                        new Ingrediente("Maionese", TipoIngrediente.MOLHO, "UN"), 1d
                )),
                new Produto("Pepsi 600ml", 7.99d, Map.of(
                        new Ingrediente("Refrigerante", TipoIngrediente.BEBIDA, "L"), 0.6d
                ))
        };
    }
}
