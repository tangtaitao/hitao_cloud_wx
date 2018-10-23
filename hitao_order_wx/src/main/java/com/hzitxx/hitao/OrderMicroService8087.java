package com.hzitxx.hitao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 订单服务
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hzitxx.hitao.mapper")
public class OrderMicroService8087 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMicroService8087.class, args);
	}
}
