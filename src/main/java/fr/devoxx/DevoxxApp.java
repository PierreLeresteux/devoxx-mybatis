package fr.devoxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"fr.devoxx"})
@EnableAutoConfiguration
@MapperScan(basePackages = {"fr.devoxx.dao"})
public class DevoxxApp {
    public static void main(String[] args) {
        SpringApplication.run(DevoxxApp.class, args);
    }
}
