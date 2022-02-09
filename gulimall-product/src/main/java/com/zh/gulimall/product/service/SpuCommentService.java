package com.zh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.common.utils.PageUtils;
import com.zh.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-09 17:13:53
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

