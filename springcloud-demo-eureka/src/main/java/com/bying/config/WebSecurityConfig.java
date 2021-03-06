package com.bying.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author chengkunxf@126.com
 * @date 2021/6/3 2:47 下午
 * @description
 */

@EnableWebSecurity

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);//加这句是为了访问eureka控制台和/actuator时能做安全控制
        http.csrf().disable();//关闭csrf
    }

}
