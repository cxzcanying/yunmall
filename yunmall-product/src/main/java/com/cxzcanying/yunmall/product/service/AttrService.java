package com.cxzcanying.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author cxzcanying

 * @date 2025-11-02 16:19:09
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

