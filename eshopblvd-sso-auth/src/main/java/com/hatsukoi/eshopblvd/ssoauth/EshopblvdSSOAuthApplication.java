package com.hatsukoi.eshopblvd.ssoauth;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableDubbo
@EnableDiscoveryClient
@EnableRedisHttpSession
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EshopblvdSSOAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopblvdSSOAuthApplication.class, args);
    }

}

