package spring.core.java_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class AnotherBean {

	private MyBean myBean;
	 
    public MyBean getMyBean() {
        return myBean;
    }
 
    @Autowired
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }
 
    @Override
    public String toString() {
        return "AnotherBean [myBean=" + myBean + "]";
    }
}
