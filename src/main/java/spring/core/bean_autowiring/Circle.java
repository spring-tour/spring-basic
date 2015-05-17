package spring.core.bean_autowiring;

public class Circle {

	// Circle 类有两个变量（autowire 和 id） 
	// 没有使用spring自动装配，仅仅用于输出
	private String autowire; 
    private String id;
    public Circle(){   
    	
    }
	public String getAutowire() {
		return autowire;
	}
	public void setAutowire(String autowire) {
		this.autowire = autowire;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
}
