package com.example.p1.repository;

import com.example.p1.model.Cliente;

import java.util.List;

public class ClienteRepository {
    private List<Cliente> clienteList;

    public List<Cliente> listarTodos(){
        return clienteList;
    }
    public void insert(Cliente cliente){
        clienteList.add(cliente);
    }
}
