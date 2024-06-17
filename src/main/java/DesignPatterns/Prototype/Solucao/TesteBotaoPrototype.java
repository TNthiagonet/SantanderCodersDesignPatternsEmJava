package DesignPatterns.Prototype.Solucao;

import DesignPatterns.Prototype.Botao;
import DesignPatterns.Prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
    public static void main(String[] args) {
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);
        
        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);
        botaoAmarelo.setLargura(60000);
        System.out.println(botaoAmarelo);
        Botao botaoAmarelo2 = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo2);
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        // Exemplo de botão que não existe no bloco static
        String chave = "BOTAO_ROXO";
        Botao botaoRoxo = new Botao();
        botaoRoxo.setCor("Roxo");
        botaoRoxo.setAltura(25);
        botaoRoxo.setLargura(90);
        botaoRoxo.setTipoBorda(TipoBordaEnum.FINA);
        BotaoRegistry.addRegistry(chave, botaoRoxo);
        Botao botaoRoxoClone = BotaoRegistry.getBotao("BOTAO_ROXO");
        System.out.println(botaoRoxoClone);
    }
}
