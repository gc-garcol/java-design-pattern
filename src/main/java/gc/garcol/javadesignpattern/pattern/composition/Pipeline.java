package gc.garcol.javadesignpattern.pattern.composition;

import gc.garcol.javadesignpattern.core.Function1;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Pipeline {

  private final TransactionService transactionService;

  public Transaction getTransaction(String txnHash) {
    final Function1<String, Transaction> pipeline =
        Function1.of((String hash) -> hash)
            .andThen(transactionService::fetchTransactionReceipt)
            .andThen(transactionService::mapReceiptToTransaction)
            .andThen(transactionService::enrichTransactionRound1)
            .andThen(transactionService::enrichTransactionRound2)
            .andThen(transactionService::enrichTransactionRound3);
    return pipeline.apply(txnHash);
  }
}
