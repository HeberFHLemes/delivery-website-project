package com.grupo6.delivery.controller;

import com.grupo6.delivery.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CardapioController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/cardapio")
    public ModelAndView verCardapio(){
        return new ModelAndView("cardapio")
                .addObject("produtos", produtoService.acharTodos());
    }

    @GetMapping("/cardapio/pesquisa")
    public ModelAndView pesquisarNoCardapio(@RequestParam(name = "pesquisa") String pesquisa){
        return new ModelAndView("cardapio")
                .addObject("produtos", produtoService.acharPeloNome(pesquisa));
    }
}