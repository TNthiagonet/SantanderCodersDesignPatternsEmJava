package DesignPatterns.ChainOfResponsibility.Solucao;

import java.math.BigDecimal;
import DesignPatterns.ChainOfResponsibility.Carro;

public class SemDesconto extends DescontoCarro{
    public SemDesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
