package com.sharfine.fmall.order.dao;

import com.sharfine.fmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author sharfine
 * @email 
 * @date 2021-01-21 14:13:16
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
