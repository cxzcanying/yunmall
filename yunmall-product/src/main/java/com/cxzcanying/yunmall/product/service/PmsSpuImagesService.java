package com.cxzcanying.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.product.entity.PmsSpuImagesEntity;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
/**
 * spu图片
 *
 * @author cxzcanying

 * @date 2025-11-02 16:14:58
 */
public interface PmsSpuImagesService extends IService<PmsSpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

