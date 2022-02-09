package com.zh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.common.utils.PageUtils;
import com.zh.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-09 17:13:53
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

