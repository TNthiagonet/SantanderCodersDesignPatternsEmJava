package DesignPatterns.ChainOfResponsibility.Solucao;

import java.math.BigDecimal;
import DesignPatterns.ChainOfResponsibility.Carro;

public class VendaCarroServiceComChainOfResponsibility {
    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto = new DescontoCarroFIAT(
            new DescontoCarroFORD(
                new DescontoCarroMaiorQueCemMil(
                    new SemDesconto(null))));
        return desconto.aplicaDesconto(carro);
    }
}
