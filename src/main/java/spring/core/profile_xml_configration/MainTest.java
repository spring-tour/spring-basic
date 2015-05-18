package spring.core.profile_xml_configration;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 
 * @author senola
 * @timer 2015-5-18
 * 
 */
public class MainTest {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "development"); //或者production
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// 方法一
		//ctx.load("spring/core/profile_xml_configration/spring-config-development.xml","spring/core/profile_xml_configration/spring-config-production.xml");
		ctx.load("spring/core/profile_xml_configration/spring-config-all.xml");
		// 方法二
		//ctx.getEnvironment().setActiveProfiles("development"); //或者production
		
		ctx.refresh();
		Person person = (Person) ctx.getBean("person");
		
		System.out.println("Person: " + person.getName());
		ctx.close();
	}
}
