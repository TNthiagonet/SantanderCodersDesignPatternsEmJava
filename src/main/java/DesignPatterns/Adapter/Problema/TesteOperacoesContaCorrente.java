package DesignPatterns.Adapter.Problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jar = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jar);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);
        // Sem adapter validaSaldo é exposto
        if(client.validaSaldo(valorPretendidoParaSaque)) {
            client.saca(valorPretendidoParaSaque);
        }

        client.deposita(new BigDecimal(700));
    }
}
