package com.lzz.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *  
 *  * All rights Reserved, Designed By www.XXXX.com
 *  * @projectName dubbo
 *  * @title     ProviderApplication   
 *  * @package    com.lzz.rpc.service.com.lzz.rpc  
 *  * @description      
 *  * @author candidcrat     
 *  * @date   2020/7/19 9:51  
 *  * @version V1.0.0
 *  * @copyright 2020 www.XXXXX.com
 *  * 注意 本内容仅限于 XXXXX科技有限公司，禁止外泄以及用于其他的商业 
 *  
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
