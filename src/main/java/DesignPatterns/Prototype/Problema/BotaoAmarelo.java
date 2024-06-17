package DesignPatterns.Prototype.Problema;

import DesignPatterns.Prototype.Botao;
import DesignPatterns.Prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
