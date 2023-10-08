package gc.garcol.javadesignpattern.pattern.composition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
  private String transactionHash;
  private String blockHash;
  private String from;
  private String to;
  private String contractAddress;
  private String blockNumber;
  private String gasUsed;
  private String amount;
}
