package com.woniuxy.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.woniuxy.springboot.entity.Student;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class MySpringBootApplicationTests {
	
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	Student student;
	
	@Test
	void contextLoads() {
		System.out.println(student);
	}

	@Test
	void contextLoads02() {
		System.out.println(ac.containsBean("someService"));
	}
	
	@Test
	void contextLoads03() {
//		log.trace("mytrace");
//		log.debug("mydebug");
//		log.info("myinfo");
//		log.warn("mywarn");
//		log.error("myerror");
		
//		Logger logger = LoggerFactory.getLogger(this.getClass());
//		logger.trace("mytrace");
//		logger.debug("mydebug");
//		logger.info("myinfo");
//		logger.warn("mywarn");
//		logger.error("myerror");
	}
}
