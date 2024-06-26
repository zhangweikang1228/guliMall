package com.kang.gulimall.ware.dao;

import com.kang.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zhangweikang
 * @email sir.willzhang@gmail.com
 * @date 2024-06-26 21:17:02
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
