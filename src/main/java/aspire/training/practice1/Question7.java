package aspire.training.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.openqa.selenium.WebElement;

public class Question7 {

	
	public static void main(String[] args) {
		
		List<WebElement> webElements = null;
		
		//You have list of WebElement
		//1 - return first element that is enabled
		Optional<String> optional=webElements .stream()
			.filter(webElm->webElm.isEnabled())
			.map(enabledWebElement->enabledWebElement.getText())
			.findFirst();
			
			//.orElse("No Element")
			//.toString();
		
		
		if(optional.isPresent()==true) {
			System.out.println(optional.get());
		}else {
			System.out.println("No element founded!");
		}
		
			

		
	}
}
