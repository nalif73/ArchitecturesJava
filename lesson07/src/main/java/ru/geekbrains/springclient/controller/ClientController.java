package ru.geekbrains.springclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.springclient.entity.Client;
import ru.geekbrains.springclient.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("api/v1/clients")
@RequiredArgsConstructor

public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public List<Client> getProductList(){
        return clientService.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Client getClientById(@PathVariable Long id) {
        return clientService.findById(id).orElseThrow(() -> new RuntimeException("Не найден клиент с id " + id));
    }

}
