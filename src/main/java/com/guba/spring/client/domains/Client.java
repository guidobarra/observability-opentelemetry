package com.guba.spring.client.domains;

import com.guba.spring.client.web.dtos.ClientDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "client")
@Setter
@Getter
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "price")
    private BigDecimal price;

    public Client(ClientDTO clientDTO) {
        this.id = clientDTO.getId();
        this.firstName = clientDTO.getFirstName();
        this.createdAt = clientDTO.getCreatedAt();
        this.price = clientDTO.getPrice();
    }
}
