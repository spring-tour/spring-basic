package spring.core.markdown4j;

import java.io.File;
import java.io.IOException;

import org.markdown4j.Markdown4jProcessor;

/**
 * Java 解析markdown文件
 * @author admin
 *
 */
public class Markdown4J {

	public static void main(String[] args) {
		try {
			//String html = new Markdown4jProcessor().process("This is a **bold** text");
			String html2 = new Markdown4jProcessor().process(new File("F:\\github\\spring-basic\\src\\main\\java\\spring\\core\\markdown4j\\demo.md"));
			System.out.println(html2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
