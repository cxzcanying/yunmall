package com.cxzcanying.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author cxzcanying

 * @date 2025-11-02 16:19:10
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

