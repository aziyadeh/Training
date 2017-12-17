package aspire.training.practice1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Question3 {

	
	public static void main(String[] args) {
		
		List<WebElement> webElements = null;
		
		//You have list of WebElement
		//1 - Click all of them
		//2 - Just click the enabled element
		
		webElements.stream().filter(cl->cl.isEnabled())
		.forEach(WebElement::click);
		
		
		
		
	}
}
