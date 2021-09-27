package com.example.p1.controller;

import com.example.p1.model.Produto;
import com.example.p1.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    public ProdutoController() {

        this.produtoRepository = new ProdutoRepository();
    }

    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> buscar() {
        return produtoRepository.listarTodos();
    }
    @PostMapping
    public  Produto inserir (@RequestBody Produto produto){
        return produtoRepository.insert(produto);
    }
    @GetMapping("/{id}")
    public Produto buscarPeloId(@PathVariable Integer id){
        return produtoRepository.buscarPeloId(id);
    }
    @PutMapping("/{id}")
    public  Produto atualizar (@PathVariable Integer id, @RequestBody Produto produto){
        return produtoRepository.atualizar(id, produto);
    }
    @DeleteMapping("/{id}")
    public void excluir (@PathVariable Integer id){
        produtoRepository.excluir(id);
    }

}

