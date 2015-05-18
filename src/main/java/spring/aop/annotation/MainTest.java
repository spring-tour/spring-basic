package spring.aop.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		 // Laod spring-config.xml file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/aop/annotation/aop-config.xml");
        ((User) ctx.getBean("user")).login();
        ctx.close();
	}
}
