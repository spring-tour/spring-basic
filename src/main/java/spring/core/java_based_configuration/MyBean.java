package spring.core.java_based_configuration;

import org.springframework.beans.factory.annotation.Value;
/**
 * 
 * @author senola
 * time: 2015-05-17
 * 描述：  @Value(value="JavaConfigBean")等价于this.setName("JavaConfigBean");
 */
public class MyBean {

	private String name;
	 
    public String getName() {
        return name;
    }
 
    @Value(value="JavaConfigBean")
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "MyBean [name=" + name + "]";
    }
}
