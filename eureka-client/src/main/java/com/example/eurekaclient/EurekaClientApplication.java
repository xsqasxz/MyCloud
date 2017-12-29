package com.example.eurekaclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  @Author xueshiqi
 *  @Date 2017/12/28
 *  服务提供方
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
        new SpringApplicationBuilder(
                EurekaClientApplication.class)
                .web(true).run(args);
	}
}
