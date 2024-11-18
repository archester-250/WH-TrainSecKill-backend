package com.pku.pojo.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class OrderItem {
    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private Long amount;
}
