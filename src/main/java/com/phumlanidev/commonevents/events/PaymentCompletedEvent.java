package com.phumlanidev.commonevents.events;

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
  private String toEmail;
  private String currency;
  private BigDecimal totalAmount;
  private Instant timestamp;
}
