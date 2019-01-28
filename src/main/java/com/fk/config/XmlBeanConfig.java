package com.fk.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Herdsric-2018-01 on 2019/1/25.
 */
@Configuration
@ImportResource("classpath:application-bean.xml")
public class XmlBeanConfig {
    public XmlBeanConfig(){
        System.out.println("----XmlBeanConfig加载---");
    }
}
