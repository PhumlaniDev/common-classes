package com.phumlanidev.commonevents.events.payment;

import com.phumlanidev.commonevents.events.order.OrderPlacedEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCompletedEvent {
  private Long paymentId;
  private Long orderId;
  private String userId;
  private String toEmail;
  private BigDecimal totalAmount;
  private String currency;
  private String transactionId;
  private Instant timestamp;
  private List<OrderPlacedEvent.OrderItemDto> items;
}
