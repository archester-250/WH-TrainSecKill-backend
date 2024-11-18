package com.pku.pojo.vo;

import com.pku.pojo.dto.OrderDTO;
import com.pku.pojo.entity.Order;
import com.pku.pojo.entity.OrderItem;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderVO {
    private Long userId;
    private List<OrderDTO> orderList;
}
