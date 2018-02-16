package com.zuul.proxy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.filters.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayproxyApplication.class, args);
	}
	
	@Bean
	public SimpleFilter getPreFilter() {
		return new SimpleFilter();
	}
}
