package DesignPatterns.Proxy.Solucao;

import DesignPatterns.Builder.Pessoa;

public interface ProxyPessoa {
    void save(Pessoa pessoa);
    
    Pessoa findById(long id);
}
