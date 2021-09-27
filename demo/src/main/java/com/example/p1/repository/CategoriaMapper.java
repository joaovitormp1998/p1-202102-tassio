package com.example.p1.repository;


import com.example.p1.model.Categoria;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaMapper implements RowMapper<Categoria> {
    @Override
    public Categoria mapRow(ResultSet result, int i) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setId(result.getInt("id"));
        categoria.setImagemSimboloUlr(result.getString("imagemSimboloUrl"));
        categoria.setNome(result.getString("nome"));
        categoria.setDescricao(result.getString("descricao"));
        return categoria;
    }
}

