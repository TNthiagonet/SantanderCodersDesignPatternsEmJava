package DesignPatterns.Prototype.Problema;

import DesignPatterns.Prototype.Botao;
import DesignPatterns.Prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(25);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
