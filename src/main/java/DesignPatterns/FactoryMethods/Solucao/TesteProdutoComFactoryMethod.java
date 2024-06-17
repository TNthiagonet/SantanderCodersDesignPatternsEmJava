package DesignPatterns.FactoryMethods.Solucao;

import DesignPatterns.FactoryMethods.Produto;
import DesignPatterns.FactoryMethods.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        // Deixa a responsabilidade de criar o objeto para a factory
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        
        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
}
