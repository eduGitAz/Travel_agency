package com.example.demo.manager;

import com.example.demo.dao.ClientRepo;
import com.example.demo.dao.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientManager {

    private ClientRepo clientRepo;

    @Autowired
    public ClientManager(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }


    public Iterable<Client> findAll() {
        return clientRepo.findAll();
    }

    public Optional<Client> findById(int id_client) {
        return clientRepo.findById(id_client);
    }

    public Client save(Client client) {
        return clientRepo.save(client);
    }

    public void deleteById(int id_client) {
        clientRepo.deleteById(id_client);
    }

}
