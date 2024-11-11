package com.pku.service;

import com.pku.pojo.dto.OrderDTO;
import com.pku.pojo.dto.OrderItemDTO;

import java.util.List;

public interface OrderService {
    public List<OrderDTO> getOrderById(Long id);

    public List<OrderItemDTO> getOrderItemById(Long orderId);
}
