package com.cxzcanying.yunmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxzcanying.yunmall.product.dao.PmsSkuInfoDao;
import com.cxzcanying.yunmall.product.entity.PmsSkuInfoEntity;
import com.cxzcanying.yunmall.product.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.common.utils.Query;


@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl extends ServiceImpl<PmsSkuInfoDao, PmsSkuInfoEntity> implements PmsSkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuInfoEntity> page = this.page(
                new Query<PmsSkuInfoEntity>().getPage(params),
                new QueryWrapper<PmsSkuInfoEntity>()
        );

        return new PageUtils(page);
    }

}