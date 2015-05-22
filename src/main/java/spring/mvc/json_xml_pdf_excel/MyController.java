package spring.mvc.json_xml_pdf_excel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller")
public class MyController {

	public MyController() {
		System.out.println("初始化 controller");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public LinkedList<Article> getArcticles(Model model) {
		FileReader reader;
		LinkedList<Article> articles = null;
		
		try {
			reader = new FileReader("spring/mvc/json_xml_pdf_excel/articles.xml");
			//convert "unmarshal" data from XML "articles.xml" to Java object LinkedList<Article>
			articles = (LinkedList) Unmarshaller.unmarshal(LinkedList.class, reader);
			model.addAttribute("articles",articles);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return articles;
	}
}
