package DesignPatterns.Adapter.Problema;

import java.math.BigDecimal;

// Simula um Jar
public class JarOperacoesContaCorrente {
    public boolean validaSaldo(BigDecimal valorPretendidoSaque) {
        System.out.println("Validando saldo...");
        return true;
    }    

    public void saca(BigDecimal valorPretendido) {
        System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valor) {
        System.out.println("Depositando...");
    }
}
