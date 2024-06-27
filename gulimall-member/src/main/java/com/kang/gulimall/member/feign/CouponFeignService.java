package com.kang.gulimall.member.feign;

import com.kang.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: guliMall
 * @package: com.kang.gulimall.coupon.feign
 * @className: CouponFeignService
 * @author: Weikang Zhang
 * @description: 远程调用别的微服务
 *  1、想要调用远程别的微服务
 *   1）引入@FeignClient注解
 *   2）便携一个接口、，告诉SrpingCloud这个接口需要调用远程服务
 *  2、声明接口的每一个方法都是调用哪个远程服务的哪个请求
 *  3、开启远程调用功能 在主类中 引入@EnableFeignClients
 * @date: 27/06/2024 21:32
 * @version: 1.0
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons ();

}
