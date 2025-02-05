package com.example.payment.api.repository;

import com.example.payment.api.model.PaymentModel;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentModel, Long> {

    // Busca por ID de usuário
    List<PaymentModel> findByUsuarioId(Long usuarioId, Sort id);

}
