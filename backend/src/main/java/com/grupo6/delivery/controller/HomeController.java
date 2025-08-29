package com.grupo6.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller responsável pela página inicial
 * (de boas-vindas) da aplicação.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView boasVindas(){
        return new ModelAndView("index");
    }
}
