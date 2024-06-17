package DesignPatterns.TemplateMethod.Solucao;

import DesignPatterns.TemplateMethod.VeiculoParaReparo;

public class ReparoVeiculoLuxoServiceComTemplateMethod extends ReparoVeiculoService {
    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
