package DesignPatterns.Builder.Solucao;

import java.time.LocalDate;

import DesignPatterns.Builder.Pessoa;

// Flexibilidade na construção do objeto, não precisa seguir a ordem
public class TestePessoaComBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder()
        .nome("Joao")
        .sobrenome("Paulo")
        .apelido("Beto")
        .documento("01234567891")
        .email("betinho@gmail.com")
        .dataNascimento(LocalDate.of(1980, 03, 21))
        .build();

        System.out.println(pessoa);
    }
}
