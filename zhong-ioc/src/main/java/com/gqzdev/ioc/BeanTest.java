package com.gqzdev.ioc;


import com.gqzdev.ioc.bean.User;
import com.gqzdev.ioc.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName BeanTest
 * @Description
 * @Author ganquanzhong
 * @Date2019/12/3 22:41
 * @Version
 **/
public class BeanTest {
	public static void main(String[] args){

		//使用ApplicationContext作为程序的入口
		//AnnotationConfigApplicationContext对注解Bean初始化
		//管理注解Bean定义的容器有两个：AnnotationConfigApplicationContext和AnnotationConfigWebApplicationContex。
		// 这两个类是专门处理Spring注解方式配置的容器，直接依赖于注解作为容器配置信息来源的IOC容器。

		//init spring bean
		ApplicationContext ac =new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext ac1 =new ClassPathXmlApplicationContext();
		User user = (User) ac.getBean("user");
//		System.out.println("appName"+ac.getAutowireCapableBeanFactory());
		System.out.println(user.toString());
	}
}
