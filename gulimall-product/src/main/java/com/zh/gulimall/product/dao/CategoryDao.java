package com.zh.gulimall.product.dao;

import com.zh.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-09 17:13:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
