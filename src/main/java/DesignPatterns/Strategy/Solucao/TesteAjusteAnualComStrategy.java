package DesignPatterns.Strategy.Solucao;

import java.math.BigDecimal;
import DesignPatterns.Strategy.Funcionario;
import DesignPatterns.Strategy.TipoContratacaoEnum;

public class TesteAjusteAnualComStrategy {
     public static void main(String[] args) {
        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();
        
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Klaus");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(4500));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Erick");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(6000));

        Funcionario funcionarioEstagiario = new Funcionario();
        funcionarioEstagiario.setNome("Felipe");
        funcionarioEstagiario.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagiario.setSalario(new BigDecimal(1300));

        System.out.println("\nANTES\n");
        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagiario);
        
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagiario, new CalculadorReajusteAnualSalarioEstagiario());
        
        System.out.println("\nDEPOIS\n");
        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagiario);
    }
}
