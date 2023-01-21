package com.duan.seata.storyage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.duan.seata.storyage")
@EnableDiscoveryClient
@MapperScan("com.duan.seata.storyage.mapper")
@EnableFeignClients
public class SeataStoryageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataStoryageApplication.class, args);
    }

}
