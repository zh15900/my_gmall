package com.zh.gulimall.member.dao;

import com.zh.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-10 14:16:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
