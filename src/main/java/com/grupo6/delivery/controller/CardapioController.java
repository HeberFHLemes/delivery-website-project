package com.grupo6.delivery.controller;

import com.grupo6.delivery.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.stream.Collectors;


@Controller
public class CardapioController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/cardapio")
    public ModelAndView verCardapio(){
        ModelAndView mv = new ModelAndView("cardapio");
        mv.addObject("produtos", produtoService.mockProdutos());
        return mv;
    }

    @GetMapping("/cardapio/pesquisa")
    public ModelAndView pesquisarNoCardapio(@RequestParam(name = "pesquisa") String pesquisa){
        return new ModelAndView("cardapio").addObject(
                "produtos",
                Arrays.stream(produtoService.mockProdutos())
                        .filter(
                                p -> p.getNome().regionMatches(true, 0, pesquisa, 0, pesquisa.length())
                        ).collect(Collectors.toList())
        );
    }
}
