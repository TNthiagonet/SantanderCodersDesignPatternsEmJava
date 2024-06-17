package DesignPatterns.Prototype.Solucao;

import java.util.HashMap;
import java.util.Map;
import DesignPatterns.Prototype.Botao;
import DesignPatterns.Prototype.TipoBordaEnum;

public class BotaoRegistry {
    private static Map<String, Botao> REGISTRY = new HashMap<>();
    // bloco static é carregado assim que a classe inicializa
    static {
        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(25);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO_AZUL", botaoAzul);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
    }

    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }
}
