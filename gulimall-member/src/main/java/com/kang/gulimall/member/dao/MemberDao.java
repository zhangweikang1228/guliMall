package com.kang.gulimall.member.dao;

import com.kang.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangweikang
 * @email sir.willzhang@gmail.com
 * @date 2024-06-26 21:03:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
