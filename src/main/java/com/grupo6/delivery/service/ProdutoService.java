package com.grupo6.delivery.service;

import com.grupo6.delivery.model.Ingrediente;
import com.grupo6.delivery.model.Produto;
import com.grupo6.delivery.model.TipoIngrediente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProdutoService {

    public Produto[] mockProdutos(){
        return new Produto[]{
                new Produto("X-Tudo", "O Hambúrguer mais completo de Caxias!", 20.99d, "xtudo.jpg", Map.of(
                        new Ingrediente("Pão", TipoIngrediente.PAO, "UN"), 1d,
                        new Ingrediente("Carne", TipoIngrediente.CARNE, "g"), 200d,
                        new Ingrediente("Alface", TipoIngrediente.SALADA, "g"), 5d,
                        new Ingrediente("Tomate", TipoIngrediente.SALADA, "g"), 20d,
                        new Ingrediente("Molho da Casa", TipoIngrediente.MOLHO, "UN"), 1d,
                        new Ingrediente("Queijo", TipoIngrediente.LATICINIO, "UN"), 2d,
                        new Ingrediente("Cebola", TipoIngrediente.SALADA, "g"), 10d
                )),
                new Produto("Batata-Frita", "Porção de batata-frita média", 6.99d, "batata-frita.jpg", Map.of(
                        new Ingrediente("Batata-Frita", TipoIngrediente.BATATA, "g"), 42.5d,
                        new Ingrediente("Ketchup", TipoIngrediente.MOLHO, "UN"), 1d,
                        new Ingrediente("Maionese", TipoIngrediente.MOLHO, "UN"), 1d
                )),
                new Produto("Pepsi 600ml", "Refrigerante Pepsi de 600ml", 7.99d, "cola.jpg", Map.of(
                        new Ingrediente("Refrigerante", TipoIngrediente.BEBIDA, "L"), 0.6d
                ))
        };
    }

    public List<Produto> mockProdutosFiltrados(String pesquisa){
        return Arrays.stream(mockProdutos())
                .filter(
                        p -> p.getNome().regionMatches(true, 0, pesquisa, 0, pesquisa.length())
                ).collect(Collectors.toList());
    }
}
