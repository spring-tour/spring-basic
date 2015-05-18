### 用注解实现AOP

#### 目标
 
  - 如何使用aop注解
         具体见代码
    
  - 为什么使用注解?
  
  简单，不需要过多的配置
  
 在xml中我们需要如下配置：
 
    <aop:config>
        <aop:aspect id="aspectUserLogger" ref="logger" >
            <aop:pointcut id="pointCutAfter"
            expression="execution(* com.hmkcode.beans.User.login(..))" />
            <aop:after method="log" pointcut-ref="pointCutAfter" />
        </aop:aspect>
    </aop:config>
而使用注解，只需要在使用@Aspect @After就行，多简洁！    
