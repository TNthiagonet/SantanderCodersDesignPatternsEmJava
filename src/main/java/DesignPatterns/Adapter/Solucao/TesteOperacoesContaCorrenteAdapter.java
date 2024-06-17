package DesignPatterns.Adapter.Solucao;

import java.math.BigDecimal;
import DesignPatterns.Adapter.Problema.JarOperacoesContaCorrente;

public class TesteOperacoesContaCorrenteAdapter {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);
        // com adapter o valor é verificado dentro do método saca
        client.saca(valorPretendidoParaSaque);
        client.deposita(new BigDecimal(700));
    }
}
