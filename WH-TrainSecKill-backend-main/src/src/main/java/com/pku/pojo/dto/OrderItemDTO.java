package com.pku.pojo.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {
    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private Long amount;
}
