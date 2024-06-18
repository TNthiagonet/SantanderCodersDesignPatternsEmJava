package DesignPatterns.Strategy.Problema;

import java.math.BigDecimal;

import DesignPatterns.Strategy.Funcionario;
import DesignPatterns.Strategy.TipoContratacaoEnum;

public class TesteAjusteAnualSemStrategy {
    public static void main(String[] args) {
        ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();
        
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Thiago");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(4500));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Maécio");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(6000));

        Funcionario funcionarioEstagiario = new Funcionario();
        funcionarioEstagiario.setNome("Jhonnatas");
        funcionarioEstagiario.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagiario.setSalario(new BigDecimal(1300));

        System.out.println("\nANTES\n");
        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagiario);
        
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT);
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ);
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagiario);
        
        System.out.println("\nDEPOIS\n");
        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagiario);


    }
}
