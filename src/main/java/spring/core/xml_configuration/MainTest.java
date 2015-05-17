package spring.core.xml_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		//加载spring-config.xml文件
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		getBeanFromXml(ctx);
		ctx.close();
	}

	public static void getBeanFromXml(ClassPathXmlApplicationContext ctx){
		// 获取定义在spring-config.xml中的 Circle bean 
		Circle circle = (Circle) ctx.getBean("Circle");
		// 操作bean
		circle.setRadius(3.0);
		circle.draw();
		circle.area();
		
		AnotherBean anotherBean = (AnotherBean) ctx.getBean("anotherBean");
		System.out.println(anotherBean.toString());
	}
}
