package com.kang.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @projectName: guliMall
 * @package: com.kang.gulimall.coupon
 * @className: GulimallCouponApplication
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 26/06/2024 21:00
 * @version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class,args);
    }

}
