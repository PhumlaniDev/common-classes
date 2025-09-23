package com.phumlanidev.commonevents.events.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestEvent {
  private Long orderId;
  private String userId;
  private BigDecimal amount;
  private Instant timestamp;
  private String toEmail;
}

