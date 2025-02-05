package com.example.payment.api.dto;

import com.example.payment.api.model.PaymentModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
    private Long id;
    private Long usuarioId;
    private String metodoPagamento;
    private BigDecimal valor;
    private String status;

    public PaymentDTO(PaymentModel model) {
        this.id = model.getId();
        this.usuarioId = model.getUsuarioId();
        this.metodoPagamento = model.getMetodoPagamento();
        this.valor = model.getValor();
        this.status = model.getStatus().name();
    }
}
