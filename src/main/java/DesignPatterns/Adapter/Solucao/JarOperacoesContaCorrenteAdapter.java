package DesignPatterns.Adapter.Solucao;

import java.math.BigDecimal;

import DesignPatterns.Adapter.Problema.JarOperacoesContaCorrente;

public class JarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrente jar;
    
    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jar) {
        this.jar = jar;
    }  
    
    // Com Adapter validaSaldo faz parte do método saca
    public void saca(BigDecimal valorPretendido) {
        if(jar.validaSaldo(valorPretendido)) {jar.saca(valorPretendido);}  
        else {throw new IllegalArgumentException("Valor para saque invalido.");}
    }

    public void deposita(BigDecimal valor) {
        jar.deposita(valor);
    }
}
