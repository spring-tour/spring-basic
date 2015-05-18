package spring.core.custom_event;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/core/custom_event/custom_event.xml");
		Login login = (Login) ctx.getBean("login");
		login.login();
		ctx.close();
	}
}
