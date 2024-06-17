package DesignPatterns.Prototype.Solucao;

import DesignPatterns.Prototype.Botao;

public class BotaoFactory {
    public static Botao getInstance(Botao prototype) {
        Botao clone = new Botao();
        clone.setCor(prototype.getCor());
        clone.setAltura(prototype.getAltura());
        clone.setLargura(prototype.getLargura());
        clone.setTipoBorda(prototype.getTipoBorda());
        return clone;
    }
}
