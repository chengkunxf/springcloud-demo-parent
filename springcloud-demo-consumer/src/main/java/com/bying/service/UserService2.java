package com.bying.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chengkunxf@126.com
 * @date 2021/5/28 6:53 下午
 * @description
 */
@Service
public class UserService2 {

    public static final String SPRINGCLOUD_EUREKA_PROVIDER_USER = "http://springcloud-eureka-provider/user";

    @Autowired
    private RestTemplate restTemplate;

    public String getUser() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(SPRINGCLOUD_EUREKA_PROVIDER_USER, String.class);
        return responseEntity.getBody();
    }
}
