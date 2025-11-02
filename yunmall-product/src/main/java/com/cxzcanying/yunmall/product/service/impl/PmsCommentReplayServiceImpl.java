package com.cxzcanying.yunmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxzcanying.yunmall.product.dao.PmsCommentReplayDao;
import com.cxzcanying.yunmall.product.entity.PmsCommentReplayEntity;
import com.cxzcanying.yunmall.product.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;

import java.util.Map;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.common.utils.Query;


@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl extends ServiceImpl<PmsCommentReplayDao, PmsCommentReplayEntity> implements PmsCommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCommentReplayEntity> page = this.page(
                new Query<PmsCommentReplayEntity>().getPage(params),
                new QueryWrapper<PmsCommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}