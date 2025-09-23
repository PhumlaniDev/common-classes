package com.phumlanidev.commonevents.events.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreatedEvent {
  private Long productId;
  private String name;
  private Integer initialQuantity;
}
