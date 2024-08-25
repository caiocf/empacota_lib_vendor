package br.com.minhaLib.servico;

import com.loquendo.tts.engineclient.constdecl.TTSEngineClientConstDeclaration;


public class MinhaClasseServico {

    private TTSEngineClientConstDeclaration ttsEngineClientConstDeclaration;

    public MinhaClasseServico() {
    }

    public String executarAcao(String entrada) {
        // Implementação da lógica de negócio usando a lib Loquendo
        return "Resultado processado: "+entrada + ", checkLoquendo " +TTSEngineClientConstDeclaration.className;
    }
}

