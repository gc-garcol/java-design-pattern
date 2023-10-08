package gc.garcol.javadesignpattern.pattern.composition;

import org.junit.jupiter.api.Test;

class PipelineTest {

  @Test
  public void whenPassTxnHashThenReceiveTransaction() {
    TransactionService transactionService = new TransactionService();
    Pipeline pipeline = new Pipeline(transactionService);
    String txnHash = "0x1234567890";
    Transaction transaction = pipeline.getTransaction(txnHash);
    System.out.println(transaction);
  }
}