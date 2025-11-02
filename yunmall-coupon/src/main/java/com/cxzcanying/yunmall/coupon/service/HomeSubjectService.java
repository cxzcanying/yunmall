package com.cxzcanying.yunmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author cxzcanying

 * @date 2025-11-02 16:56:18
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

