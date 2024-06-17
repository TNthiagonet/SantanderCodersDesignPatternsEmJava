package DesignPatterns.Prototype.Problema;

import DesignPatterns.Prototype.Botao;
import DesignPatterns.Prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
