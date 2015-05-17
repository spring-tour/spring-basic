## 学习目标

  - spring 如何用@Autowired注解进行自动装配
  - @Autowired的不同用法(四种)
    - 属性注入
    - 构造方法注入
    - setting方法注入
    - 一般方法注入

具体如代码

### 总结  

  - 1. @Autowired 可以用于属性, 构造器，方法
  - 2. 如果可以允许bean为空则使用@Autowired(required=fase)
  - 3. 注入一个特殊的bean使用@Qualifer("beanName")  
