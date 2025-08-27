package com.grupo6.delivery.controller;

import com.grupo6.delivery.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


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
}
