package com.example.demoweb.service;

import br.com.minhaLib.servico.MinhaClasseServico;
import org.springframework.stereotype.Service;

@Service
public class Servico {

    private final MinhaClasseServico minhaClasseServico;

    public Servico() {
        this.minhaClasseServico = new MinhaClasseServico();
    }

    public String processarEntrada(String entrada) {
        //TTSEngineClient abc = new TTSEngineClient();

        return minhaClasseServico.executarAcao(entrada);
    }
}
