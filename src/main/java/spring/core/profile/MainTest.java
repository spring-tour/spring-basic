package spring.core.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("development"); // 或者production
		ctx.scan("spring.core.profile"); // 注册所有的 @Configuration 类
		// ctx.register(SpringConfigDev.class);
		ctx.refresh();
		Person person = (Person)ctx.getBean("person");
		System.out.println("Person: " + person.getName());
		ctx.close();
	}
}
