package spring.aop.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// 加载xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/aop/learning/aop-config.xml");
		User user = (User) ctx.getBean("user");
		user.login();
		ctx.close();
	}
}
