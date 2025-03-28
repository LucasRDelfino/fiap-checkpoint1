package br.com.fiap.checkpoint1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clienteNome;
    private LocalDate dataPedido = LocalDate.now();
    private double valorTotal;
}
