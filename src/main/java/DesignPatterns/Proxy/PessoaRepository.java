package DesignPatterns.Proxy;

import DesignPatterns.Builder.Pessoa;
import java.util.HashMap;
import java.util.Map;

// import DesignPattern.Builder.Pessoa;

public class PessoaRepository {
    private Map<Long, Pessoa> banco = new HashMap<>();
    private static long countId = 1;

    public void save(Pessoa pessoa) {banco.put(countId++, pessoa);}

    public Pessoa findById(long id) {
        try {
            System.out.println("Esperando 2 segundos");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }
}
