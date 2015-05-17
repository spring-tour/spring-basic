package spring.core.java_based_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public MyBean myBean(){
        return  new MyBean();
    }
	@Bean(name = "anotherBean2")
	public AnotherBean anotherBean(){
        return new AnotherBean();
    }
}
