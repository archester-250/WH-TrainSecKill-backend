package com.pku.pojo.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class Order {
    private Long orderId;
    private Long userId;
    private BigDecimal orderPrice;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
