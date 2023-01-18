package com.duan.seata.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.duan.seata.user.*")
@EnableDiscoveryClient
@MapperScan("com.duan.seata.user.mapper")
public class SeataUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataUserApplication.class, args);
    }

}
