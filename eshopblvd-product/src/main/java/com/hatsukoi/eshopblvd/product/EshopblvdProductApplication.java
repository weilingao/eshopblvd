package com.hatsukoi.eshopblvd.product;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDubbo
@EnableDiscoveryClient
@MapperScan("com.hatsukoi.eshopblvd.product.dao")
@SpringBootApplication(scanBasePackages = "com.hatsukoi.eshopblvd")
public class EshopblvdProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopblvdProductApplication.class, args);
    }

}
