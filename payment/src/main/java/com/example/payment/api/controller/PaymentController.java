package com.example.payment.api.controller;

import com.example.payment.api.model.PaymentModel;
import com.example.payment.api.service.PaymentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    
    @Operation(summary = "Obter todos os pagamentos", description = "Retorna a lista de todos os pagamentos registrados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamentos encontrados"),
            @ApiResponse(responseCode = "404", description = "Nenhum pagamento encontrado")
    })
    @GetMapping
    public List<PaymentModel> getAll() {
        return paymentService.getAll();
    }



    @Operation(summary = "Obter pagamento por ID", description = "Retorna o pagamento correspondente ao ID fornecido")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamento encontrado"),
            @ApiResponse(responseCode = "404", description = "Pagamento não encontrado")
    })
    @GetMapping("/{id}")
    public PaymentModel getPaymentById(@PathVariable Long id) {
        return paymentService.getById(id);
    }


    @Operation(summary = "Obter pagamentos por ID de usuário", description = "Retorna a lista de pagamentos correspondentes ao ID de usuário fornecido")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamentos encontrados"),
            @ApiResponse(responseCode = "404", description = "Nenhum pagamento encontrado para o ID de usuário fornecido")
    })
    @GetMapping("/usuario/{usuarioId}")
    public List<PaymentModel> getPaymentByIdUser(@PathVariable Long usuarioId) {
        return paymentService.getByIdUser(usuarioId);
    }


    @Operation(summary = "Criar um pagamento", description = "Cria um novo pagamento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Pagamento criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida")
    })
    @PostMapping
    public PaymentModel createPayment(@RequestBody PaymentModel payment) {
        return paymentService.createPayment(payment);
    }


    @Operation(summary = "Atualizar um pagamento existente", description = "Atualiza um pagamento existente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamento atualizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Pagamento não encontrado")
    })
    @PutMapping("/{id}")
    public PaymentModel updatePayment(@PathVariable Long id, @RequestBody PaymentModel payment) {
        return paymentService.updatePayment(id, payment);
    }


    @Operation(summary = "Excluir um pagamento", description = "Exclui um pagamento existente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pagamento excluído com sucesso"),
            @ApiResponse(responseCode = "404", description = "Pagamento não encontrado")
    })
    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }
}
