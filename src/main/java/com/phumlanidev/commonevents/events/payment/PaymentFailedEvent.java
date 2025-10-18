package com.phumlanidev.commonevents.events.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentFailedEvent {

  private Long paymentId;
  private Long orderId;
  private String userId;
  private BigDecimal totalAmount;
  private String currency;
  private String transactionId;
  private Instant timestamp;
}
