package com.example.p1.model;

public class PromocaoItem {
    private Integer id;
    private Float valorPromocao;
    private String dataHoraCadastro;
    private String dataHoraUltimaAtualizacao;
    private Produto produto;
    private TabelaPromocao tabelaPromocao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(Float valorPromocao) {
        this.valorPromocao = valorPromocao;
    }


    public void setDataCadastro(String dataCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    

    public String getDataUltimaAtualizacao() {
        return dataHoraUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
        this.dataHoraUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public TabelaPromocao getTabelaPromocao() {
        return tabelaPromocao;
    }

    public void setTabelaPromocao(TabelaPromocao tabelaPromocao) {
        this.tabelaPromocao = tabelaPromocao;
    }

    public void setDataHoraUltimaAtualizacao(String dataHoraUltimaAtualizacao) {
    }

    public void setDatHoraCadastro(String dataHoraCadastro) {
    }
}
