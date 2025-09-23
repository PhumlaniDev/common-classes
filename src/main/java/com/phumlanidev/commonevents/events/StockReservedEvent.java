package com.phumlanidev.commonevents.events;

import com.phumlanidev.commonevents.events.order.OrderPlacedEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StockReservedEvent {
  private Long orderId;
  private String userId;
  private List<OrderPlacedEvent.OrderItemDto> items;
  private Instant timestamp;
}
