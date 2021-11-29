package com.gqzdev.ioc;

import com.gqzdev.ioc.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Jack
 * @Date 2021/11/14 15:12
 */
public class XmlBeanTest {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-bean01.xml");

		for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}

		User user = (User)ac.getBean("user");
		System.out.println(user.toString());
	}
}
