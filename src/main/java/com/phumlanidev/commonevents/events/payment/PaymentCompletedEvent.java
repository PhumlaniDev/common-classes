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
public class PaymentCompletedEvent {
  private Long orderId;
  private Long userId;
  private String toEmail;
  private String currency;
  private BigDecimal totalAmount;
  private String transactionId;
  private Instant timestamp;
}
