package spring.core.xml_configuration;

public class MyBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "MyBean[name=" + name + "]";
	}
}
