package aspire.training.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;

public class Question5 {

	
	public static void main(String[] args) {
		
		List<WebElement> webElements = null;
		
		//You have list of WebElement
		//1 - map each weblement to it is text
		//2 - return list of element texts
		List<String> texts = webElements
					.stream().map(w->w.getText())
					.collect(Collectors.toList());
		
		
		
	}
}
