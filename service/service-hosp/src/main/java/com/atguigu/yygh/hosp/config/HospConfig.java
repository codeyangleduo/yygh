package com.atguigu.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author dabao
 * @Date 2023/2/26 20:29
 * @Description
 */

@Configuration
@MapperScan("com.atguigu.yygh.hosp.mapper")
public class HospConfig {
}
