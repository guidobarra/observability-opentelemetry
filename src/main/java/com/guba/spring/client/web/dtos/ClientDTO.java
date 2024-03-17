package com.guba.spring.client.web.dtos;

import com.guba.spring.client.domains.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private Long id;
    private String firstName;
    private LocalDateTime createdAt;
    private BigDecimal price;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.createdAt = client.getCreatedAt();
        this.price = client.getPrice();
    }
}
