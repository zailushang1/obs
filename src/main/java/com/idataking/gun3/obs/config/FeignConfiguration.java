package com.idataking.gun3.obs.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.idataking.gun3.obs")
public class FeignConfiguration {

}
