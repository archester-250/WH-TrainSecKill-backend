package com.pku.mapper;

import com.pku.pojo.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    @Select("select * from orderitem where orderId = #{orderId}")
    List<OrderItem> selectOrderItemByOrderId(Long orderId);
}
