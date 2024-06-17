package DesignPatterns.Adapter.Solucao;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarAdapter) {
        this.jarAdapter = jarAdapter;
    }

    public void saca(BigDecimal valorPretendido) {
        jarAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor) {
        jarAdapter.deposita(valor);
    }
   
}
