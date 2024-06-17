package DesignPatterns.FactoryMethods.Problema;

import DesignPatterns.FactoryMethods.ProdutoDigital;
import DesignPatterns.FactoryMethods.ProdutoFisico;

// Problema: setar uma característica por conta própria pode ser problemático
public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
