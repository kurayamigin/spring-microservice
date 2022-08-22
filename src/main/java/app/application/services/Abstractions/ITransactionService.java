package app.application.services.Abstractions;

import app.application.dtos.TransactionDto;

import java.util.List;

public interface ITransactionService {
    List<TransactionDto> GetAll();
}
