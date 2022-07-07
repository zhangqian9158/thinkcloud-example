package com.chinagoods.framework.thinkcloud.repo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhangqian9158@gmail.com
 */
@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = {"com.chinagoods.framework.thinkcloud.repo.mapper"})
public class RepoQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepoQuickstartApplication.class, args);
    }

}
