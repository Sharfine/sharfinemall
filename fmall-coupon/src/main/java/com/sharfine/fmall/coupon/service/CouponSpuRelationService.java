package com.sharfine.fmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sharfine.common.utils.PageUtils;
import com.sharfine.fmall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author sharfine
 * @date 2021-01-21 14:11:19
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

