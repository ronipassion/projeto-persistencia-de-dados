package br.com.alura.screenmatch.service.traducao;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosResposta(@JsonAlias(value = "translatedText") String textoTraduzido,
                            double match) {
}
