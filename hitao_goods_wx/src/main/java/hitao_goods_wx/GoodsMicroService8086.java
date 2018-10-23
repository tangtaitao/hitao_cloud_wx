package hitao_goods_wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 商品微服务
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hzitxx.hitao.mapper")
public class GoodsMicroService8086 {
	public static void main(String[] args) {
		SpringApplication.run(GoodsMicroService8086.class, args);
	}
}
