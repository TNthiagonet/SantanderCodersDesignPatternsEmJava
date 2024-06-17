package DesignPatterns.ChainOfResponsibility.Solucao;

import java.math.BigDecimal;
import DesignPatterns.ChainOfResponsibility.Carro;

public abstract class DescontoCarro {
    protected DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicaDesconto(Carro carro);
}
