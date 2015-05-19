package spring.mvc.view_json_xml_pdf;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

/**
 * 
 * @author senola 
 *
 * builds PDF using iText
 */
public class PdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest req, HttpServletResponse resp)
			throws Exception { 
		System.out.println("pdf");
        Person person = (Person) model.get("person");
        doc.add( new Paragraph(person.toString()));
		
	}
}
