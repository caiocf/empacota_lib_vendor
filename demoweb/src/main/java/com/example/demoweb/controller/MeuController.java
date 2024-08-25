package com.example.demoweb.controller;


import com.example.demoweb.service.Servico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MeuController {

    private final Servico servico;

    public MeuController(Servico servico) {
        this.servico = servico;
    }

    @GetMapping
    public String index (){
        return servico.processarEntrada("ola mundo");
    }
}
