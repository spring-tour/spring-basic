package spring.core.bean_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShareBox {

	// 1. Autowired 作为类注入
	// Autowired 不设定属性
	@Autowired
	private Circle circle;
	
	// required = false ==> 表示如果没有Triangle bean存在也是合法的
	@Autowired(required = false)
	private Triangle triangle;
	
	// 2. Autowired 作为构造方法参数
	@Autowired
	public ShareBox(Rectangle rectangle) {
		System.out.println("Rectangle has been autowired to constructor");
	}
	
	// 3. Autowired 作为方法注入
	// 注入一个set方法
	// 表示在setCircle方法调用之前Circle已经被注入了
	@Autowired
    public void setCircle(Circle circle) {
        if(this.circle != null ){
            System.out.println("Circle has been autowired to property \""+
                    "this setCircle has been called because it has @Autowired\"");
        }else{
            this.circle = circle;
            System.out.println("Circle has been autowired to setCircle");
        }
    }
	
	// 4. Autowired作为方法注入(不一定是setting方法)
	// @Qualifier -->表示注入的bean叫做"c2"
	@Autowired
	@Qualifier("c2")
	public void drawCircle(Circle circle) {
		System.out.println("Drawing autowired Circle (c2) ");
	}
}
