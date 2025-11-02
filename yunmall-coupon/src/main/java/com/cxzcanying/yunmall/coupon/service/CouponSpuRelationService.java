package com.cxzcanying.yunmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author cxzcanying

 * @date 2025-11-02 16:56:18
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

