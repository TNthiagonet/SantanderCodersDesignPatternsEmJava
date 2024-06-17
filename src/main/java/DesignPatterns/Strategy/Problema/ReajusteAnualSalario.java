package DesignPatterns.Strategy.Problema;

import java.math.BigDecimal;
import DesignPatterns.Strategy.Funcionario;
import DesignPatterns.Strategy.TipoContratacaoEnum;

public class ReajusteAnualSalario {
    // Formato sem Strategy, possíveis novos IFs (formas de contratação) aumenta o risco de bugs
    // Com uma nova forma de contratação, é recomendável construir o necessário sem alterar essa clase
    // Para isso, utiliza-se Strategy
    public void calculaReajusteAnual(Funcionario funcionario) {
        if(TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
        } else if (TipoContratacaoEnum.PJ.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
        } else if (TipoContratacaoEnum.ESTAGIO.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        } 
    }
}
