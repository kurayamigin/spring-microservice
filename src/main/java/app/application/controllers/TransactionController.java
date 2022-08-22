package app.application.controllers;

import app.application.dtos.TransactionDto;
import app.application.services.Abstractions.ITransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transactions")
public class TransactionController {

    private final ITransactionService _service;

    public TransactionController(ITransactionService service) {
        _service = service;
    }

    @GetMapping()
    public ResponseEntity<List<TransactionDto>> GetAll() {
        return ResponseEntity.ok(_service.GetAll());
    }
}
