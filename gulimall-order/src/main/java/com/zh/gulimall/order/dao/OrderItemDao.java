package com.zh.gulimall.order.dao;

import com.zh.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author zenghui
 * @email 3103045176@qq.com
 * @date 2022-02-10 14:14:41
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
