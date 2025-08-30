package com.grupo6.delivery.controller;

import com.grupo6.delivery.dto.ProdutoDTO;
import com.grupo6.delivery.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/cardapio")
public class CardapioRestController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> ver(){
        return ResponseEntity.ok().body(produtoService.acharTodos());
    }

    @GetMapping("/pesquisa")
    public ResponseEntity<List<ProdutoDTO>> pesquisarNoCardapio(@RequestParam(name = "pesquisa") String pesquisa) {
        return ResponseEntity.ok().body(produtoService.acharPeloNome(pesquisa));
    }
}