
## 学习目的

 - spring如何进行自动装配 
 - 自动装配的方法（类型，名称s，构造器）
 
 列子中的结果：
 
 - shapeBox 没有注入
 - shapeBox2 autowire=”byName” 等价于 shapeBox2.setCircle(bean named cirlce)
 - ShapeBox3 autowire=”byType” 等价于 shapeBox3.setCirlce(bean of type Cirlce)
 - shapeBox4 autowire=”constructor” 等价于 new ShapeBox(bean of type Cirlce)
 - autowire-candidate=”false” 等价于 ignore when autowire by type
 
 注意： 在xml中 autowire有5中类型，可以在<bean/>元素中使用autowire属性指定
 
 - no   不使用自动装配，必须通过ref元素指定依赖，默认设置
 - byName 根据属性名自动装配。此选项将检查容器并根据名字查找与属性完全一致的bean，并将其与属性自动装配。 
 - byType 如果容器中存在一个与指定属性类型相同的bean，那么将与该属性自动装配；如果存在多个该类型bean，
                 那么抛出异常， 并指出不能使用byType方式进行自动装配；如果没有找到相匹配的bean，则什么事都不发生，
                 也可以通过设置dependency-check="objects"让Spring抛出异常。  
 - constructor  与byType方式类似，不同之处在于它应用于构造器参数。如果容器中没有找到与构造器参数类型一致的bean，
                           那么抛出异常。 
 - autodetect  通过bean类的自省机制（introspection）来决定是使用constructor还是byType方式进行自动装配。如果发现默认的   
                          构造器，那么将使用byType方式。

### 可以设置bean使自动装配失效： 
采用xml格式配置bean时，将<bean/>元素的autowire-candidate属性设置为false，这样容器在查找自动装配对象时，将不考虑该bean，
即它不会被考虑作为其它bean自动装配的候选者，但是该bean本身还是可以使用自动装配来注入其它bean的。

### 注意：
  
   你可以在<beans /> 标签中加入default-auto="byType"属性，这样<beans> 下的所有bean都默认使用该装配类型


                          
            
                