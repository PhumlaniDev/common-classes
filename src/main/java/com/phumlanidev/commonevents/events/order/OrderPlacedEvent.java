package com.phumlanidev.commonevents.events.order;

import com.phumlanidev.commonevents.events.product.ProductDto;
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
public class OrderPlacedEvent {

  private String userId;
  private Long orderId;
  private BigDecimal total;
  private String toEmail;
  private Instant timestamp;
  private List<OrderItemDto> items;


  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class OrderItemDto {
    private Long productId;
    private int quantity;
    private ProductDto productDetails;
  }
}
