package spring.mvc.view_json_xml_pdf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/view")
	public Person getPerson(Model model){
		Person person = new Person();
		person.setId(1);
		person.setName("senola");
		model.addAttribute("person", person);
		return person;
	}
}
