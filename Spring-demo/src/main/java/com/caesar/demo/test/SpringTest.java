package com.caesar.demo.test;

import com.caesar.demo.service.UserService;
import com.caesar.demo.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caesar
 * @desc
 * @email 504479518@qq.com
 * @date 2022/1/20 1:30
 */
public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(UserServiceImpl.class);
		applicationContext.refresh();
		UserService userService = applicationContext.getBean(UserService.class);
		userService.show();
	}
}
