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
 * 2、细节
 * 1)、命名空间：配置隔离
 *      默认：public(保留空间);默认新增的所有配置都在public空间。
 *      1、开发、测试、生产
 *      # 可以选择对应的命名空间 ,即写上对应环境的命名空间ID
 *      在bootstrap.properties 配置spring.cloud.nacos.config.namespace=0cf86a9f-1993-4cfc-9f2a-b7c3532db1ac
 *也可以为每个微服务配置一个命名空间，微服务互相隔离
 *
 * 配置集：一组相关或不相关配置项的集合。
 *
 * 配置集ID：类似于配置文件名，即Data ID
 *
 * 配置分组：默认所有的配置集都属于DEFAULT_GROUP。自己可以创建分组，比如双十一，618，双十二
 *
 * spring.cloud.nacos.config.group=DEFAULT_GROUP  # 更改配置分组
 * 最终方案：每个微服务创建自己的命名空间，然后使用配置分组区分环境（dev/test/prod）
 *
 * 加载多配置集
 * 我们要把原来application.yml里的内容都分文件抽离出去。我们在nacos里创建好
 * 后，在coupons里的bootstrap.properties指定要导入的配置即可。
 */
@SpringBootApplication
@EnableDiscoveryClient//开启服务注册发现功能
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
