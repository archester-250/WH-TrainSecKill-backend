package com.pku.controller.order;

import com.pku.context.BaseContext;
import com.pku.pojo.dto.OrderDTO;
import com.pku.pojo.dto.OrderItemDTO;
import com.pku.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("user/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/history")
    public ResponseEntity<List<OrderDTO>> getOrderList() {
        Long userId = BaseContext.getCurrentId();
        return ResponseEntity.ok(orderService.getOrderById(userId));
    }
    @GetMapping("/history/{id}")
    public ResponseEntity<List<OrderItemDTO>> getOrderItems(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrderItemById(id));
    }
}
