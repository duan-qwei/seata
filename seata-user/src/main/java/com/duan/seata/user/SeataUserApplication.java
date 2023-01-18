package com.duan.seata.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.duan.seata.user.*")
@EnableDiscoveryClient
@MapperScan("com.duan.seata.user.mapper")
@EnableFeignClients
public class SeataUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataUserApplication.class, args);
    }

}
