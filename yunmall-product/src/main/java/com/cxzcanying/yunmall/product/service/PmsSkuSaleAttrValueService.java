package com.cxzcanying.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.product.entity.PmsSkuSaleAttrValueEntity;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
/**
 * sku销售属性&值
 *
 * @author cxzcanying

 * @date 2025-11-02 16:14:58
 */
public interface PmsSkuSaleAttrValueService extends IService<PmsSkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

