package com.example.p1.model;


import java.time.LocalDate;
import java.time.LocalTime;

public class Usuario {
    private Integer id;
    private String nomeCompleto;
    private String email;
    private String senha;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;

    public Usuario() {
    }

    //Sobrecarga - Overload
    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario(Integer id, String nomeCompleto, String email, String senha, LocalDate dataCadastro, LocalTime horaCadastro, LocalDate dataUltimaAtualizacao, String urlFoto) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.horaCadastro = horaCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.urlFoto = urlFoto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
    public Integer setId(Integer id) {
       return 0;
    }
     Sobrecargar não leva em consideração o retorno do método.
     Apenas a parte da assinatura onde há nome do método e parâmetros é considerado.
    **/

    //Sobrecarga - Overload
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
    

    /**
        def setId(id):
            self.__id = id

        def setId(codigo):
            self.__id = '00' + codigo

        Não existe sobrecarga no Python!
        O python vê dois métodos com mesmo nome recebendo o mesmo tipo de variável.
        Ele não vê diferença, então, não aceira, pois não vai saber qual chamar.

     **/

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
