package com.cxzcanying.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.product.entity.PmsProductAttrValueEntity;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
/**
 * spu属性值
 *
 * @author cxzcanying

 * @date 2025-11-02 16:14:58
 */
public interface PmsProductAttrValueService extends IService<PmsProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

