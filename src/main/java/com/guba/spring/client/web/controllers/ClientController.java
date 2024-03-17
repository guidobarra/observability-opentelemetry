package com.guba.spring.client.web.controllers;


import com.guba.spring.client.domains.Client;
import com.guba.spring.client.reposotory.ClientRepository;
import com.guba.spring.client.web.dtos.ClientDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
@Log4j2
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable(name = "id") Long id) {
        log.info("ClientController findById: {}", id);
        return clientRepository
                .findById(id)
                .map(ClientDTO::new)
                .orElse(null);
    }

    @PostMapping
    public ClientDTO save(@RequestBody ClientDTO clientDTO) {
        log.info("ClientController save: {}", clientDTO);
        Client client = clientRepository.save(new Client(clientDTO));
        return new ClientDTO(client);
    }

}
