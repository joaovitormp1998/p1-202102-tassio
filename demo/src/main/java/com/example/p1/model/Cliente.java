package com.example.p1.model;


import java.time.LocalDate;
import java.time.LocalTime;


/**
 * Paradigma Procedural (Estruturado) = Script fluido com métodos
 * Paradigma Orientado a Objetos = Herança, Encapsulamento, Polimorfismo. É uma aproximação do código com o domínio.
 *   -----  Muito utilizado no núcleo do projeto. Onde há as regras de negócio costuma ser OO para representar o negócio em questão.
 * Paradigm Funcional = Modelos matemáticos.
 * Paradigmas Componentizado = Muito utilizado em front-end. (React)
 *
 *
 **/
public class Cliente extends Usuario {

    private String fotoUrl;
    private String cpf;
    private LocalDate dataNascimento;
    private Endereco endereco; //Por estar dentro do mesmo pacote, não precisa de importação.

    public Cliente(Integer id, String nomeCompleto, String email, String senha, LocalDate dataCadastro, LocalTime horaCadastro, LocalDate dataUltimaAtualizacao, String urlFoto, String fotoUrl, String cpf, LocalDate dataNascimento, Endereco endereco) {
        super(id, nomeCompleto, email, senha, dataCadastro, horaCadastro, dataUltimaAtualizacao, urlFoto);
        this.fotoUrl = fotoUrl;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Cliente() {
        return;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Não é o ideal fazer getters e setters para TUDO.
     * Do que adianta encapsular com private se depois tudo vai ter um SET comum, sem fazer nada?
     * Pra quê criar um SET se tudo o que faz é variavel = valor? É a mesma coisa que deixar público.
     *
     * Em vários casos, o melhor será receber os valores por construtor e ter tudo privado.
     * Do construtor em diante toda manipulação dos dados será através de métodos referentes ao negócio.
     * O problema de entidades com getters e setters sem sentido, enxutos, é que sua entidade fica anêmica, sem propósito.
     * Uma entidade deve encapsular não só valores, mas REGRAS, FUNÇÕES DO NEGÓCIO.
     * Se existe uma entidade endereço, TUDO relacionado a endereços tem que estar nela.
     */
    private static class Endereco {
        // Utilizar wrapper aumenta os recursos disponíveis para trabalhar com o valor.
        private Integer id;
        private String rua;
        private Integer numero;
        private String cep;
        private String complemento;
        private Integer telefone;
        private String bairro;
        private LocalDate dataCadastro;
        private LocalTime horaCadastro;
        private LocalDate dataUltimaAtualizacao;
        private Cidade cidade;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public Integer getTelefone() {
            return telefone;
        }

        public void setTelefone(Integer telefone) {
            this.telefone = telefone;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public LocalDate getDataCadastro() {
            return dataCadastro;
        }

        public void setDataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        public LocalTime getHoraCadastro() {
            return horaCadastro;
        }

        public void setHoraCadastro(LocalTime horaCadastro) {
            this.horaCadastro = horaCadastro;
        }

        public LocalDate getDataUltimaAtualizacao() {
            return dataUltimaAtualizacao;
        }

        public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        }

        public Cidade getCidade() {
            return cidade;
        }

        public void setCidade(Cidade cidade) {
            this.cidade = cidade;
        }
    }
}
