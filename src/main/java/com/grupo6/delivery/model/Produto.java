package com.grupo6.delivery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter @AllArgsConstructor
public class Produto {
    private String nome;
    private Double preco;
    private String imagem;
    private Map<Ingrediente, Double> ingredientes;
}