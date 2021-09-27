package com.example.p1.controller;

import com.example.p1.model.Cliente;
import com.example.p1.repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    public ClienteController() {
        this.clienteRepository = new ClienteRepository();
    }

    private ClienteRepository clienteRepository;
    @GetMapping
    public List<Cliente> buscar() {
        return clienteRepository.listarTodos();
    }
}

