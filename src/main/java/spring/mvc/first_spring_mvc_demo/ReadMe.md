### spring mvc 

- 如何搭建springmvc环境

1. 引入相关的包

![](http://7xi3m0.com1.z0.glb.clouddn.com/spring/springmvc-jar.png)

 - 配置web.xml
 
      <servlet>
	    <servlet-name>springmvc</servlet-name>
	    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		    <init-param>
		      <param-name>contextConfigLocation</param-name>
		      <param-value>classpath:spring/mvc/first_spring_mvc_demo/springmvc-config.xml</param-value>
		    </init-param>
		    <load-on-startup>1</load-on-startup>
		 </servlet>
	  <servlet-mapping>
	    <servlet-name>springmvc</servlet-name>
	    <url-pattern>/rest/*</url-pattern>
	  </servlet-mapping>
 - 配置spring-config.xml
 
        <?xml version="1.0" encoding="UTF-8"?>
		<beans  xmlns="http://www.springframework.org/schema/beans"
		        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		        xmlns:context="http://www.springframework.org/schema/context"
		        xsi:schemaLocation="http://www.springframework.org/schema/beans
		        http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
		        http://www.springframework.org/schema/context
		        http://www.springframework.org/schema/context/spring-context.xsd">
		    <context:component-scan base-package="spring.mvc.first_spring_mvc_demo" />
		    <bean id="viewResolver"
		        class="org.springframework.web.servlet.view.UrlBasedViewResolver">
			    <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
			    <property name="prefix" value="/WEB-INF/jsp/"/>
			    <property name="suffix" value=".jsp"/>
			</bean>
		</beans>
 - Controller
    
        @Controller
		public class MyController {
		 
		    @RequestMapping("/hello")
		    public String sayHello(){
		        System.out.println("hello");
		        //return redirect us to (view) index.html 
		        return "/index.html";
		    }
		 
		}
 - 访问
   
       locahost:8080/spring-basic/rest/hello
 