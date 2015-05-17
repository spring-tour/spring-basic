package spring.core.bean_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static ApplicationContext ctx;
    public static void main(String args[]){
 
        // 加载 bean-autowired.xml 文件
        ctx = new ClassPathXmlApplicationContext("spring/core/bean_Autowired/bean-autowired.xml");
 
    }
}
