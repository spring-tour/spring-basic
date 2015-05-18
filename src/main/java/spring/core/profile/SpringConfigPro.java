package spring.core.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class SpringConfigPro {
	 @Bean
	  public Person person(){
	 
	      Person person =  new Person();
	      person.setId(2);
	      person.setName("pro-person");
	      return person;
	  }
}
