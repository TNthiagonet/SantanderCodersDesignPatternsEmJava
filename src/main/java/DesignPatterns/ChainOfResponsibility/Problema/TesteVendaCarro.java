package DesignPatterns.ChainOfResponsibility.Problema;

import java.math.BigDecimal;

import DesignPatterns.ChainOfResponsibility.Carro;
import DesignPatterns.ChainOfResponsibility.Marca;

public class TesteVendaCarro {
    public static void main(String[] args) {
        VendaCarroService vendaCarroService = new VendaCarroService();

        Carro c1 = new Carro();
        c1.setMarca(Marca.FORD);
        c1.setModelo("ECOSPORT");
        c1.setPreco(new BigDecimal(90000));

        BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(c1);
        System.out.println("Valor de venda do ECOSPORT: " + c1.getPreco());
        System.out.println("Valor de venda do ECOSPORT com desconto: " + valorVenda1);
        
        Carro c2 = new Carro();
        c2.setMarca(Marca.FIAT);
        c2.setModelo("MOBI");
        c2.setPreco(new BigDecimal(72000));

        BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(c2);
        System.out.println("Valor de venda do MOBI: " + c2.getPreco());
        System.out.println("Valor de venda do MOBI com desconto: " + valorVenda2);
        
        Carro c3 = new Carro();
        c3.setMarca(Marca.CHEVROLET);
        c3.setModelo("TRACKER");
        c3.setPreco(new BigDecimal(120000));

        BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(c3);
        System.out.println("Valor de venda do TRACKER: " + c3.getPreco());
        System.out.println("Valor de venda do TRACKER com desconto: " + valorVenda3);
    }
}
