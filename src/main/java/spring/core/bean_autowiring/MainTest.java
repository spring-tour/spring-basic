package spring.core.bean_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static ApplicationContext ctx;
	public static void main(String args[]){
		// 加载 spring-config.xml 文件
		ctx = new ClassPathXmlApplicationContext("spring/core/bean_autowiring/bean-autowiring.xml");

	}
}
