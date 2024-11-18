package com.pku.mapper;

import com.pku.pojo.dto.OrderDTO;
import com.pku.pojo.entity.Order;
import com.pku.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("select * from orders where userId = #{userId}")
    List<Order> selectOrderByUserId(Long userId);
}
