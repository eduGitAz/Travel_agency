package com.example.demo.api;

import com.example.demo.dao.entity.Client;
import com.example.demo.manager.ClientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientApi {

    private ClientManager clientManager;

    @Autowired
    public ClientApi(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    @GetMapping("/getAllClients")
    public Iterable<Client> getAll()
    {
        return clientManager.findAll();
    }

    @GetMapping
    public Optional<Client> getById(@RequestParam int id) {
        return clientManager.findById(id);
    }


    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientManager.save(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return clientManager.save(client);
    }

    @DeleteMapping
    void deleteClient (@RequestParam int id) {
        clientManager.deleteById(id);
    }


}
