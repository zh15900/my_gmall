package com.zh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.common.utils.PageUtils;
import com.zh.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-10 14:18:10
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

