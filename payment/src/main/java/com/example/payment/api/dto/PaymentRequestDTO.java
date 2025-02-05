package com.example.payment.api.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public class PaymentRequestDTO {

    @NotNull(message = "O ID do usuário é obrigatório")
    private Long usuarioId;

    @NotBlank(message = "O método de pagamento não pode estar em branco")
    private String metodoPagamento;

    @NotNull(message = "O valor do pagamento é obrigatório")
    @DecimalMin(value = "0.01", message = "O valor deve ser maior que 0")
    private BigDecimal valor;

    // Construtores
    public PaymentRequestDTO() {}

    public PaymentRequestDTO(Long usuarioId, String metodoPagamento, BigDecimal valor) {
        this.usuarioId = usuarioId;
        this.metodoPagamento = metodoPagamento;
        this.valor = valor;
    }

    // Getters e Setters
    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
