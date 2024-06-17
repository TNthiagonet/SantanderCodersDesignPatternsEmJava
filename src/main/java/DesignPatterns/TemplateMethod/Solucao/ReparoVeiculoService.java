package DesignPatterns.TemplateMethod.Solucao;


// Vai servir como Template
public abstract class ReparoVeiculoService {
    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()) {
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    // A diferença entre as implementações
    protected abstract boolean veiculoParaReparo();

    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Notificando perda total para seguradora...");
    }

    private void repararVeiculo() {
        System.out.println("Reparando veiculo...");
    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Notificando reparo para a seguradora...");
    }

    private void analisarDanos() {
        System.out.println("Analisando dados...");
    }

    // protected dá a opção das classes filhas implementarem os métodos,
    // abstract obriga
    protected void entradaOficina() {
        System.out.println("Veiculo entrando na oficina...");
    }
}
