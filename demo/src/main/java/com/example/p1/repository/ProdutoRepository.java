package com.example.p1.repository;

import com.example.p1.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private List<Produto> produtoList;

    public ProdutoRepository() {
        this.produtoList = new ArrayList<>();
    }

    public List<Produto> listarTodos() {
        return produtoList;
    }

    public Produto insert(Produto produto) {
        produto.setId(produtoList.size() + 1);
        produtoList.add(produto);
        return produto;
    }

    public Produto insert(Produto produto, Integer id) {
        produto.setId(id);
        produtoList.add(produto);
        return produto;
    }

    public Produto buscarPeloId(Integer id) {
        for (Produto produto : produtoList) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    public Produto atualizar(Integer id, Produto produto) {
        excluir(id);
        produto = insert(produto, id);
        return produto;
    }

    public void excluir(Integer id) {
        Produto produto = buscarPeloId(id);
        produtoList.remove(produto);
    }

    public Produto buscarPeloNome(String nome) {
        for (Produto produto : produtoList) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }
}
