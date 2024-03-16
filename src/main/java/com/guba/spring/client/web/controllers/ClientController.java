package com.guba.spring.client.web.controllers;


import com.guba.spring.client.web.dtos.ClientDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable(name = "id") Long id) {
        return new ClientDTO(id, "GUBA", LocalDateTime.now(), BigDecimal.TEN);
    }
}
