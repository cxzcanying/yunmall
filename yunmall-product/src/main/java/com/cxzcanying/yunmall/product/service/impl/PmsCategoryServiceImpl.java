package com.cxzcanying.yunmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxzcanying.yunmall.product.dao.PmsCategoryDao;
import com.cxzcanying.yunmall.product.entity.PmsCategoryEntity;
import com.cxzcanying.yunmall.product.service.PmsCategoryService;
import org.springframework.stereotype.Service;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.common.utils.Query;


@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

}