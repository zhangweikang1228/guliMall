package com.kang.gulimall.coupon.dao;

import com.kang.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangweikang
 * @email sir.willzhang@gmail.com
 * @date 2024-06-26 20:51:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
