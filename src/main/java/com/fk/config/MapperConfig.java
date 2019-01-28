package com.fk.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Herdsric-2018-01 on 2019/1/25.
 */
@Configuration
@MapperScan("com.fk.dao")
public class MapperConfig {
    public MapperConfig(){
        System.out.println("----Mapperconfig加载----");
    }
}
