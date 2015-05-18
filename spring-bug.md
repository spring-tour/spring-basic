### spring 环境BUG

#### 1. 报错如下：

 - JAX-RS (REST Web Services) 2.0 can not be installed : One or more constraints have not been satisfied.
 - JAX-RS (REST Web Services) 2.0 requires Java 1.6 or newer.

![spring-jax-rs-error.png](http://7xi3m0.com1.z0.glb.clouddn.com/spring/spring-jax-rs-error.png)

JDK用的是1.7， jre1.7 没发现什么错误，最后谷歌大神给出了答案： 原来这个是eclipse的BUG，JAX-RS 2.0 JAX-RS 2.0 Facet should not require Java7, but Java6,

详情见：<a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=416704" target="_blank">https://bugs.eclipse.org/bugs/show_bug.cgi?id=416704</a>

解决方法： 

在pom.xml中加入一下代码，

	   <build>
	       <plugins>
	          <plugin>
	                <groupId>org.apache.maven.plugins</groupId>
	                <artifactId>maven-compiler-plugin</artifactId>
	                <configuration>
	                    <source>1.7（修改成自己JDK的版本）</source>
	                    <target>1.7 (修改成自己JDK的版本)</target>
	                </configuration>
	            </plugin>
	       </plugins>
	    </build>

再 maven-> update project 就成了！