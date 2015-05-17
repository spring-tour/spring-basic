package spring.core.xml_configuration;

public class AnotherBean {

	private MyBean myBean;

	public MyBean getMyBean() {
		return myBean;
	}

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}
	
	@Override
	public String toString(){
		return "AnotherBean[name=" + myBean + "]";
	}
}
