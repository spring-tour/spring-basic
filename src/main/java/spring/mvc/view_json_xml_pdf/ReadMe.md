#### 目标
  - 使用springMVC 构建Rest服务，返回不通的媒体类型---json, xml, pdf
  
#### 环境
  - Spring-Framework-4.x
  - Logging (jar)
  - Jackson json (core & mapper 1.9.7) 
  - Bruno Lowagie’s iText 5.0.6

#### 访问

  - localhost:8080/spring-basic/rest/view.json
  - localhost:8080/spring-basic/rest/view.xml
  - localhost:8080/spring-basic/rest/view.pdf
  
  
注意： 

 - 对于java.io.File 来说，不要使用文件的相对位置，他们依赖于当前的工作目录，而且代码是是不可控的，
 
 如：  
 
 spring.mvc.json_xml_pdf_excel包下的articles.xml文件可以用以下方法读取
 
 　URL url = getClass().getResource("articles.xml");
　　File file = new File(url.getPath());
若想获取字节流，则使用：
InputStream input = getClass().getResourceAsStream("articles.xml");