package spring.mvc.first_spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("hello");
		// return redirect to view index.html
		return "index";
	}
}
