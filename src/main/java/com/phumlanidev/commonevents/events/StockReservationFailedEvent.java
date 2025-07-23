package com.phumlanidev.commonevents.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StockReservationFailedEvent {
  private Long orderId;
  private String userId;
  private String reason;
  private Instant timestamp;
}

