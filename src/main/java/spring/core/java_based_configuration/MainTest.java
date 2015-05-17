package spring.core.java_based_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author senola
 * @timer 2015-05-17
 * 描述： Java-Based Configuration测试类
 */
public class MainTest {

	public static void main(String[] args) {
		// 注意，此处没有基于xml文件
		ApplicationContext ctxJavaConfig = new AnnotationConfigApplicationContext(JavaConfig.class);
		AnotherBean anotherBean = (AnotherBean) ctxJavaConfig.getBean("anotherBean2"); 
		System.out.println(anotherBean);
	}
}
