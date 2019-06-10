package com.lover.system;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author: 李惠福
 * @Create: 2019/5/31  17:22
 */
@SpringBootApplication
@EnableEurekaClient
@Configuration
@MapperScan("com.lover.system.mapper")
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class);
    }

    @Primary
    @Bean
    public DataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}
