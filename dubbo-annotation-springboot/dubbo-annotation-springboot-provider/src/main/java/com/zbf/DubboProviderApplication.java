package com.zbf;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther:
 * @Date: 2018/12/13 17:13
 * @Description:
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.zbf.server")
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
