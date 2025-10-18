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
public class PaymentInitiatedEvent {

  private Long paymentId;
  private Long orderId;
  private String userId;
  private BigDecimal amount;
  private String currency;
  private String paymentMethod;
  private Instant timestamp;
}
