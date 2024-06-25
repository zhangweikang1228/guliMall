package com.kang.gulimall.product;

import com.kang.gulimall.product.entity.BrandEntity;
import com.kang.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Huai Wei");
        brandEntity.setDescript("单元测试");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
