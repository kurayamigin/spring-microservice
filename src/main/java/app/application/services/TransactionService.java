package app.application.services;

import app.application.dtos.TransactionDto;
import app.application.mappers.ITransactionMapper;
import app.application.services.Abstractions.ITransactionService;
import app.domain.models.Transaction;
import app.domain.repositories.ITransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    private final ITransactionRepository _transactionRepository;

    private final ITransactionMapper _transactionMapper;

    public TransactionService(ITransactionRepository transactionRepository, ITransactionMapper transactionMapper) {
        _transactionRepository = transactionRepository;
        _transactionMapper = transactionMapper;
    }


    public List<TransactionDto> GetAll() {
        List<Transaction> transactions = _transactionRepository.findAll();
        return _transactionMapper.ToDto(transactions);
    }
}
