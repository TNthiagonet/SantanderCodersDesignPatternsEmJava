package DesignPatterns.Proxy.Problema;

import java.time.LocalDate;
import DesignPatterns.Builder.Pessoa;
import DesignPatterns.Proxy.PessoaService;
import DesignPatterns.Proxy.Solucao.PessoaRepositoryProxy;

// PessoaService tem conexão direta com PessoaRepository
public class PessoaTest {
    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(pessoaRepositoryProxy);

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
    }
}
