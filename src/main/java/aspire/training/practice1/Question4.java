package aspire.training.practice1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Question4 {

	
	public static void main(String[] args) {
		
		List<WebElement> webElements = null;
		
		//You have list of WebElement
		//1 - map each weblement to it is text
		//2 - print all text
		
		webElements.stream()
			.map(w->w.getText())
			.filter(w1-> w1.equals("test"))
			.forEach(text->System.err.print(text));
		
		
	}
}
