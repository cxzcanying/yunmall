package com.cxzcanying.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.product.entity.PmsSkuInfoEntity;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
/**
 * sku信息
 *
 * @author cxzcanying

 * @date 2025-11-02 16:14:58
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

