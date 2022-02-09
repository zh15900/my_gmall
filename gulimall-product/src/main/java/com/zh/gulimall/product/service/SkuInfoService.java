package com.zh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.common.utils.PageUtils;
import com.zh.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-09 17:13:53
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

