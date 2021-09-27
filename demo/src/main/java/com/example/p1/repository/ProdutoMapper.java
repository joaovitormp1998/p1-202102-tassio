package com.example.p1.repository;

import com.example.p1.model.Produto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoMapper implements RowMapper<Produto> {
    @Override
    public Produto mapRow(ResultSet result, int i) throws SQLException {
        Produto produto = new Produto();
        produto.setId(result.getInt("id"));
        produto.setNome(result.getString("nome"));
        produto.setDescricao(result.getString("descricao"));
        produto.setFotoUrl(result.getString("fotoUrl"));
        produto.setDataCadastro(result.getString("dataHoraCadastro"));
        produto.setDataHoraUltimaAtualizacao(result.getString("dataHoraUltimaAtualizacao"));
        produto.setValorUnitario(result.getString("valorUnitario"));
        return produto;
    }
}
