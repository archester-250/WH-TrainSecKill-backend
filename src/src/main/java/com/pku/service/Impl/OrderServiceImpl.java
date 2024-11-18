package com.pku.service.Impl;

import com.pku.mapper.OrderItemMapper;
import com.pku.mapper.OrderMapper;
import com.pku.pojo.dto.OrderDTO;
import com.pku.pojo.dto.OrderItemDTO;
import com.pku.pojo.entity.Order;
import com.pku.pojo.entity.OrderItem;
import com.pku.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Override
    public List<OrderDTO> getOrderById(Long id) {
        List<Order> orderList = orderMapper.selectOrderByUserId(id);
        List<OrderDTO> orderDTOList = new ArrayList<>();
        for(Order order : orderList) {
            OrderDTO orderDTO = new OrderDTO();
            BeanUtils.copyProperties(order, orderDTO);
            orderDTOList.add(orderDTO);
        }
        return orderDTOList;
    }

    @Override
    public List<OrderItemDTO> getOrderItemById(Long orderId) {
        List<OrderItem> orderItemList = orderItemMapper.selectOrderItemByOrderId(orderId);
        List<OrderItemDTO> orderItemDTOList = new ArrayList<>();
        for(OrderItem orderItem : orderItemList) {
            OrderItemDTO orderItemDTO = new OrderItemDTO();
            BeanUtils.copyProperties(orderItem, orderItemDTO);
            orderItemDTOList.add(orderItemDTO);
        }
        return orderItemDTOList;
    }

}
