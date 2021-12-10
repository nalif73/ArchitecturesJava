package ru.geekbrains.springclient.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.springclient.entity.Client;
import ru.geekbrains.springclient.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(Long id){
        return clientRepository.findById(id);
    }

    public Object save(Client client){
        return clientRepository.save(client);
    }

    public void delete(Client client){
        clientRepository.delete(client);
    }

}
