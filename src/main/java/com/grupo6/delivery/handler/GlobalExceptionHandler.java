package com.grupo6.delivery.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView error(Exception e){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("error", "Ocorreu um erro...");
        return mv;
    }
}
