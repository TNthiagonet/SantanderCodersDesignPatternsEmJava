package DesignPatterns.Strategy.Solucao;

import DesignPatterns.Strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {
    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
       calculador.calculaReajusteAnual(funcionario);
    }
}
