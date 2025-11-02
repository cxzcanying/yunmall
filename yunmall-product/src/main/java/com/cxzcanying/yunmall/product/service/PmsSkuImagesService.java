package com.cxzcanying.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.product.entity.PmsSkuImagesEntity;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
/**
 * sku图片
 *
 * @author cxzcanying

 * @date 2025-11-02 16:14:58
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

