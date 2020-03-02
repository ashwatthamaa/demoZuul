package com.pankaj.demoZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.pankaj.demoZuul.filters.DemoZuulPreFilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class DemoZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoZuulApplication.class, args);
	}

	@Bean
	public DemoZuulPreFilter demoZuulPreFilter() {
		return new DemoZuulPreFilter();
	}
}
