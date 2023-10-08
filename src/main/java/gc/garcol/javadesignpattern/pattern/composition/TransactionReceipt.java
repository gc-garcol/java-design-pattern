package gc.garcol.javadesignpattern.pattern.composition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionReceipt {
  private String txnHash;
  private String blockHash;
}
