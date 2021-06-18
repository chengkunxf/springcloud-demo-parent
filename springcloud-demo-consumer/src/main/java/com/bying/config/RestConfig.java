package com.bying.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chengkunxf@126.com
 * @date 2021/6/18 11:03 上午
 * @description
 */
@Configuration
public class RestConfig {

    @LoadBalanced//使用Ribbon实现负载均衡的调用 (spring cloud -> 封装ribbon + eureka + restTemplate)
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
