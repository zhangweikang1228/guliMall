package com.kang.gulimall.product.dao;

import com.kang.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangweikang
 * @email sir.willzhang@gmail.com
 * @date 2024-06-25 14:02:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
