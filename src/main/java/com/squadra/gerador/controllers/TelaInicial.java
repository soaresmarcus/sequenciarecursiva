package com.squadra.gerador.controllers;

import com.squadra.gerador.utils.Gerador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TelaInicial {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/")
    public String getForm(ModelMap model, @RequestParam("indice") int indice){
        String sequencia = new Gerador().geraSequencia(indice);
        model.addAttribute("indice", String.valueOf(indice));
        model.addAttribute("sequencia", sequencia);
        return "index";
    }
}
