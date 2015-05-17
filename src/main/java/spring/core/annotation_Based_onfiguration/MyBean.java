package spring.core.annotation_Based_onfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 *  @Component(value="myAnnotationBean") 该注解能使Spring在扫描并实例化一个名叫myAnnotationBean的Bean
 *  @Value(value="world") 该注解等价于myAnnotationBean.setName("world");
 */
@Component(value="myAnnotationBean")
public class MyBean {

	private String name;
	
	public String getName() {
		return name;
	}
	
	@Value(value="world")
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "My-annotation-Bean[name=" + name + "]";
	}
}
