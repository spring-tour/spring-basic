package spring.core.annotation_Based_onfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Component(value="anotherBean"): 让spring实例化一个叫anotherBean的Bean
 *
 * @Autowired @Qalifier(“myAnnotationBean″): 等价于anotherBean.setMyBean(myAnnotationBean);
 */

@Component(value="anotherAnnotationBean")
public class AnotherBean {

	private MyBean myBean;
	
	public MyBean getMyBean() {
		return myBean;
	}

	@Autowired
	@Qualifier("myAnnotationBean")
	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}
	
	@Override
    public String toString() {
        return "AnotherBean [myBean=" + myBean + "]";
    }
}
