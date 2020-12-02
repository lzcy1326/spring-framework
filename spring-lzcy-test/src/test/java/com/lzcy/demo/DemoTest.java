package com.lzcy.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		Teacher teacher = (Teacher) ac.getBean("teacher");
		System.out.println(teacher);
	}

}
