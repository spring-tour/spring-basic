package spring.core.annotation_Based_onfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author senola
 * time: 2015-05-17
 * 描述： 基于spring注解配置 测试类
 */
public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		AnotherBean anotherBean = (AnotherBean) ctx.getBean("anotherAnnotationBean");
		System.out.println(anotherBean);
	}
}
