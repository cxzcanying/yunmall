package com.cxzcanying.yunmall.order.dao;

import com.cxzcanying.yunmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cxzcanying

 * @date 2025-11-02 17:00:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
