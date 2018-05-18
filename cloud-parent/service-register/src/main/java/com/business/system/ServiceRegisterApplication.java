package com.business.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 */
@SpringBootApplication
@EnableEurekaServer //通过@EnableEurekaServer启动一个服务注册中心给其他应用使用
public class ServiceRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegisterApplication.class, args);
    }
}
