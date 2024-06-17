package DesignPatterns.Builder.Solucao;
import java.time.LocalDate;

@SuppressWarnings("unused")
public class PessoaBuilder {
    private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }
    public PessoaBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }
    public PessoaBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }
    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }
    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }
    public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    // public Pessoa criaPessoa(){
    //     return new Pessoa(nome, sobrenome, documento, email, apelido, dataNascimento);
    // }
}
