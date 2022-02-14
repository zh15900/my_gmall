package com.zh.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1.如何使用nacos作为配置中心统一管理配置
 * 1)、引入依赖,
 *   <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 * 2)、创建bootstrap.properties.
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *  加载bootstrap.properties配置依赖  Spring Boot版本大于2.4.0版本
 *         <dependency>
 *             <groupId>org.springframework.cloud</groupId>
 *             <artifactId>spring-cloud-starter-bootstrap</artifactId>
 *         </dependency>
 * 3)、需要给配置中心默认添加一个叫数据集（Data Id）gulimall-coupon.properties. 默认规则，应用名.properties
 * 4)、给应用名.properties添加任何配置
 * 5)、动态获取配置。
 *      @RefreshScope 动态获取并刷新配置
 *      @Value("${配置项的名}") 获取到配置
 *      如果配置中心和当前的配置中心都配置了相同的项，优先使用配置中心的配置
 */
@SpringBootApplication
@EnableDiscoveryClient//开启服务注册发现功能
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
