package DesignPatterns.Builder.Problema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import DesignPatterns.Builder.Pessoa; // Importa a classe Pessoa do pacote DesignPatterns.Builder

public class TestePessoa {
    public static void main(String[] args) {
        // Formatar a data de nascimento a partir de uma string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("27/04/1981", formatter);

        // Usar o builder para criar uma instância de Pessoa
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Thiago")
                .sobrenome("NET")
                .documento("12345678910")
                .email("email@dominio.com")
                .apelido("ThiagoNET")
                .dataNascimento(dataNascimento)
                .build();

        // Exibir a pessoa criada
        System.out.println(pessoa);
    }
}
