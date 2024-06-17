package DesignPatterns.Proxy.Solucao;

import java.time.LocalDate;
import DesignPatterns.Builder.Pessoa;
import DesignPatterns.Proxy.PessoaService;

public class TestePessoaComProxy {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        // Tentar passar outro proxy dá erro, pois PessoaService espera receber o proxy definido
        // Para resolver isso, utiliza-se interface (polimorfismo)
        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);

        Pessoa pessoa = new Pessoa.PessoaBuilder()
        .sobrenome("Alexandre")
        .nome("Klinger")
        .apelido("Kiko")
        .documento("99999999999")
        .dataNascimento(LocalDate.of(1992, 04, 21))
        .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        // A segunda chamada vai ser mais rápida por estar em cache
        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}
    

