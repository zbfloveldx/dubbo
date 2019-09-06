package com.zbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @ClassName:  DubboConsumerApplication   
 * @Description:消费者
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.zbf"})
@ImportResource(locations = "classpath:consumer.xml")
public class DubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}

}
