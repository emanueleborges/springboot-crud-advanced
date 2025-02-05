package com.example.payment.api.dto;

import com.example.payment.api.model.StatusPayment;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentResponseDTO {

    private Long id;
    private Long usuarioId;
    private String metodoPagamento;
    private BigDecimal valor;
    private LocalDateTime dataCriacao;
    private StatusPayment status;

    // Construtores
    public PaymentResponseDTO() {}

    public PaymentResponseDTO(Long id, Long usuarioId, String metodoPagamento, 
                              BigDecimal valor, LocalDateTime dataCriacao, StatusPayment status) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.metodoPagamento = metodoPagamento;
        this.valor = valor;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public StatusPayment getStatus() {
        return status;
    }

    public void setStatus(StatusPayment status) {
        this.status = status;
    }
}
