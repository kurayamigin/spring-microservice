package app.application.mappers;

import app.application.dtos.TransactionDto;
import app.domain.models.Transaction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITransactionMapper {

    TransactionDto ToDto(Transaction t);
    Transaction ToEntity(TransactionDto t);
    List<TransactionDto> ToDto(List<Transaction> t);
    List<Transaction> ToEntity(List<TransactionDto> t);
}
