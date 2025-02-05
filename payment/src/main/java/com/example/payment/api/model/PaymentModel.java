package com.example.payment.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_payment")
@Getter  //Lombok
@Setter
@NoArgsConstructor // Lombok 
@AllArgsConstructor // Lombok 
@Builder
public class PaymentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Geração automática do ID
    private Long id;

    @NotNull
    private Long usuarioId;

    @NotBlank
    private String metodoPagamento;

    @NotNull
    @DecimalMin("0.01")
    private BigDecimal valor;

    private LocalDateTime dataCriacao = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private StatusPayment status = StatusPayment.PENDENTE;  // Valor padrão do status
}
