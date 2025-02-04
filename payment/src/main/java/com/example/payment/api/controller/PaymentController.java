package com.example.payment.api.controller;

import com.example.payment.api.model.PaymentModel;
import com.example.payment.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Endpoint para obter todos os pagamentos
    @GetMapping
    public List<PaymentModel> getAll() {
        return paymentService.getAll();
    }



    // Endpoint para obter pagamento por ID
    @GetMapping("/{id}")
    public PaymentModel getPaymentById(@PathVariable Long id) {
        return paymentService.getById(id);
    }

    // Endpoint para obter pagamento por ID
    @GetMapping("/usuario/{usuarioId}")
    public List<PaymentModel> getPaymentByIdUser(@PathVariable Long usuarioId) {
        return paymentService.getByIdUser(usuarioId);
    }

    // Endpoint para criar um pagamento
    @PostMapping
    public PaymentModel createPayment(@RequestBody PaymentModel payment) {
        return paymentService.createPayment(payment);
    }

    // Endpoint para atualizar um pagamento existente
    @PutMapping("/{id}")
    public PaymentModel updatePayment(@PathVariable Long id, @RequestBody PaymentModel payment) {
        return paymentService.updatePayment(id, payment);
    }

    // Endpoint para excluir um pagamento
    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }
}
