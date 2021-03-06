package com.sharfine.fmall.member.dao;

import com.sharfine.fmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sharfine
 * @email 
 * @date 2021-01-21 14:23:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
