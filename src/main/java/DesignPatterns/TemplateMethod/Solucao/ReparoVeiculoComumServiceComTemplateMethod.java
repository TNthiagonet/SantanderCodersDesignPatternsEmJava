package DesignPatterns.TemplateMethod.Solucao;

import DesignPatterns.TemplateMethod.VeiculoParaReparo;

public class ReparoVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService {
    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    // método definido como protected, então dá pra sobrescrever
    @Override
    protected void entradaOficina() {
        System.out.println("Entrando na oficina comum...");
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
