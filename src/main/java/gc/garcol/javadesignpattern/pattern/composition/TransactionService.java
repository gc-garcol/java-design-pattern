package gc.garcol.javadesignpattern.pattern.composition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransactionService {

  public TransactionReceipt fetchTransactionReceipt(String txnHash) {
    log.info("FETCH TRANSACTION RECEIPT...");
    return TransactionReceipt.builder()
        .txnHash(txnHash)
        .blockHash("blockHash")
        .build();
  }

  public Transaction mapReceiptToTransaction(TransactionReceipt receipt) {
    log.info("MAP RECEIPT TO TRANSACTION...");
    return Transaction.builder()
        .transactionHash(receipt.getTxnHash())
        .blockHash(receipt.getBlockHash())
        .build();
  }

  public Transaction enrichTransactionRound1(Transaction transaction) {
    log.info("ENRICH TRANSACTION ROUND 1...");
    transaction.setFrom("from");
    transaction.setTo("to");
    return transaction;
  }

  public Transaction enrichTransactionRound2(Transaction transaction) {
    log.info("ENRICH TRANSACTION ROUND 2...");
    transaction.setContractAddress("contractAddress");
    transaction.setBlockNumber("blockNumber");
    return transaction;
  }

  public Transaction enrichTransactionRound3(Transaction transaction) {
    log.info("ENRICH TRANSACTION ROUND 3...");
    transaction.setGasUsed("gasUsed");
    transaction.setAmount("amount");
    return transaction;
  }

}
