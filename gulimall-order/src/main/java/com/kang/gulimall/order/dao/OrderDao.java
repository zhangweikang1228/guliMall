package com.kang.gulimall.order.dao;

import com.kang.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangweikang
 * @email sir.willzhang@gmail.com
 * @date 2024-06-26 21:13:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
