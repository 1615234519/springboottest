package com.woniuxy.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woniuxy.springboot.service.SomeService;

@Configuration
public class SomeServiceConfig {
	@Bean
	public SomeService someService() {
		return new SomeService();
	}
}
