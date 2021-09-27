package com.example.p1.repository;

import com.example.p1.model.PromocaoItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromocaoItemMapper implements RowMapper<PromocaoItem> {
    @Override
    public PromocaoItem mapRow(ResultSet result, int i) throws SQLException {
        PromocaoItem promocaoItem = new PromocaoItem();
        promocaoItem.setId(result.getInt("id"));
        promocaoItem.setValorPromocao(result.getFloat("ValorPromocao"));
        promocaoItem.setDatHoraCadastro(result.getString("dataHoraCadastro"));
        promocaoItem.setDataHoraUltimaAtualizacao(result.getString("dataHoraUltimaAtualizacao"));
        promocaoItem.setId(result.getInt("produtoId"));
        promocaoItem.setId(result.getInt("promocaoId"));
        return promocaoItem;
    }
}
