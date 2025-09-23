package com.phumlanidev.commonevents.events.order;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class OrderNotificationDto {

  private String userId;
  private Long orderId;
  private String toEmail;
  private BigDecimal total;
  private Instant timestamp;
  private List<OrderPlacedEvent.OrderItemDto> items;
}
