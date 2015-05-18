package spring.core.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 
 * @author senola
 *
 * @Configuration 注解类等价于xml配置
 * 
 * 等价于：
 *   <?xml version="1.0" encoding="UTF-8"?>
 *	 <beans..... profile="development">
 *		   <bean id="person" class="com.hmkcode.vo.Person">
 *		       <property name="id" value="1" />
 *		       <property name="name" value="dev-person" />
 *		   </bean>
 *	 </beans>
 */
@Configuration
@Profile("development")
public class SpringConfigDev {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setId(1);
		person.setName("dev-person");
		return person;
	}
}
