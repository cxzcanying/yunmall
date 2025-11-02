package com.cxzcanying.yunmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxzcanying.yunmall.product.dao.PmsProductAttrValueDao;
import com.cxzcanying.yunmall.product.entity.PmsProductAttrValueEntity;
import com.cxzcanying.yunmall.product.service.PmsProductAttrValueService;
import org.springframework.stereotype.Service;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.common.utils.Query;


@Service("pmsProductAttrValueService")
public class PmsProductAttrValueServiceImpl extends ServiceImpl<PmsProductAttrValueDao, PmsProductAttrValueEntity> implements PmsProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductAttrValueEntity> page = this.page(
                new Query<PmsProductAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsProductAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}