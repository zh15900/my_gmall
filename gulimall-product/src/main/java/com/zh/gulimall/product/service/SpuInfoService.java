package com.zh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.common.utils.PageUtils;
import com.zh.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-09 17:13:53
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

