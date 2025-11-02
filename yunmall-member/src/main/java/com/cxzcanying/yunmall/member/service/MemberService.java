package com.cxzcanying.yunmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxzcanying.yunmall.common.utils.PageUtils;
import com.cxzcanying.yunmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author cxzcanying

 * @date 2025-11-02 16:59:06
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

