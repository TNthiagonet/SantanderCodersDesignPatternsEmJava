package DesignPatterns.FactoryMethods.Solucao;

import DesignPatterns.FactoryMethods.Produto;
import DesignPatterns.FactoryMethods.ProdutoDigital;
import DesignPatterns.FactoryMethods.ProdutoFisico;
import DesignPatterns.FactoryMethods.TipoProdutoEnum;

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;       
            default:
                throw new IllegalArgumentException("Tipo de Produto nao disponivel.");
        }
    }
}
