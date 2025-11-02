package com.cxzcanying.yunmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author cxzcanying

 * @date 2025-11-02 16:56:18
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

