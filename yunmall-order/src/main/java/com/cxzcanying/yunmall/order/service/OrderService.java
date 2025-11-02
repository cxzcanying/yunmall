package com.cxzcanying.yunmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author cxzcanying

 * @date 2025-11-02 17:00:20
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

