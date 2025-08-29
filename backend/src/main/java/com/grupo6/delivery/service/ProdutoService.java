package com.grupo6.delivery.service;

import com.grupo6.delivery.dto.ProdutoDTO;
import com.grupo6.delivery.mapper.ProdutoMapper;
import com.grupo6.delivery.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    private final ProdutoMapper produtoMapper;

    public List<ProdutoDTO> acharTodos() {
        return this.produtoRepository.findAll()
                .stream()
                .map(produtoMapper::toDTO).toList();
    }

    public List<ProdutoDTO> acharPeloNome(String nome) {
        return this.produtoRepository.findByNomeContainingIgnoreCase(nome)
                .stream()
                .map(produtoMapper::toDTO).toList();
    }
}