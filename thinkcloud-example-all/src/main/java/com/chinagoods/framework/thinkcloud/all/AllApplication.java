package com.chinagoods.framework.thinkcloud.all;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhangqian9158@gmail.com
 */
@EnableDubbo(scanBasePackages = "com.chinagoods")
@SpringBootApplication(scanBasePackages = "com.chinagoods")
@MapperScan(basePackages = {"com.chinagoods.framework.thinkcloud.repo.mapper"})
public class AllApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllApplication.class, args);
    }

}
