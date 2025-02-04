package com.example.payment.api.service;

import com.example.payment.api.model.PaymentModel;
import com.example.payment.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Retorna todos os pagamentos
    public List<PaymentModel> getAll() {
        return paymentRepository.findAll();
    }

    // Retorna um pagamento por ID
    public PaymentModel getById(Long id) {
        Optional<PaymentModel> payment = paymentRepository.findById(id);
        return payment.orElseThrow(() -> new RuntimeException("Payment not found"));
    }

    // Retorna um pagamento por ID
    public List<PaymentModel> getByIdUser(Long usuarioId) {
        List<PaymentModel> payments = paymentRepository.findByUsuarioId(usuarioId);
        if (payments.isEmpty()) {
            throw new RuntimeException("No payments found for usuarioId: " + usuarioId);
        }
        return payments;
    }

    // Cria um novo pagamento
    public PaymentModel createPayment(PaymentModel payment) {
        return paymentRepository.save(payment);
    }

    // Atualiza um pagamento existente
    public PaymentModel updatePayment(Long id, PaymentModel payment) {
        if (!paymentRepository.existsById(id)) {
            throw new RuntimeException("Payment not found");
        }
        payment.setId(id);
        return paymentRepository.save(payment);
    }

    // Exclui um pagamento
    public void deletePayment(Long id) {
        if (!paymentRepository.existsById(id)) {
            throw new RuntimeException("Payment not found");
        }
        paymentRepository.deleteById(id);
    }
}
