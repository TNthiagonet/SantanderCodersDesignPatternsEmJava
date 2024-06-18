package DesignPatterns.Builder.Solucao;

import java.time.LocalDate;

import DesignPatterns.Builder.Pessoa;

// Flexibilidade na construção do objeto, não precisa seguir a ordem
public class TestePessoaComBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder()
        .nome("Thiago")
        .sobrenome("Bruno")
        .apelido("ThiagoNET")
        .documento("12345678910")
        .email("thiagobrunomenezesdacosta@gmail.com")
        .dataNascimento(LocalDate.of(1981, 04, 27))
        .build();

        System.out.println(pessoa);
    }
}
