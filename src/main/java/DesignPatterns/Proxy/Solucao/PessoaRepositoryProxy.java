package DesignPatterns.Proxy.Solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import DesignPatterns.Builder.Pessoa;
import DesignPatterns.Proxy.PessoaRepository;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {
    // Supondo que por algum motivo não devemos modificar PessoaRepository e queremos logs.
    // Cria-se uma nova classe que herda dela.
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando metodo save.");
        super.save(pessoa);
        log.info("Finalizando metodo save.");

    }

    @Override
    public Pessoa findById(long id) {
        Pessoa pessoa = null;
        log.info("Iniciando metodo findById.");
        long inicio = System.currentTimeMillis();
        if(Objects.nonNull(cache.get(id))) {
            log.info("Buscando dentro de cache...");
            pessoa = cache.get(id);
        } else {
            pessoa = super.findById(id);
            log.info("Buscando dentro de PessoaRepository...");
            cache.put(id, pessoa);
        }
        log.info("Finalizando metodo findById.");
        long fim = System.currentTimeMillis();
        System.out.println("Tempo total: " + (fim - inicio));
        return pessoa;
    }
}
