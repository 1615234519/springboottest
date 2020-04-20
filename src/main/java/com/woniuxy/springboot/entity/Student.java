package com.woniuxy.springboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix="student")
@PropertySource("classpath:student.properties")
public class Student {
	
//	@Value("55")
	private int sid;
	// 使用@Value读取默认配置文件，不需要指定context placeholder
//	@Value("${student.sname}")
	private String sname;
	private School school;
	
}
