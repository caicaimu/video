package com.liu.system;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;


@SpringBootApplication
@EnableDiscoveryClient
public class SystemApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SystemApplication.class);


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SystemApplication.class);
        Environment environment = application.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Eureka地址:\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
    }
}
