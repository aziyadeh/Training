package aspire.training.practice1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Question6 {

	
	public static void main(String[] args) {
		
		List<WebElement> webElements = null;
		
		//You have list of WebElement
		//1 - return true if all elements are enabled, false otherwise
		
		boolean passed =webElements
						.stream()
						.filter(webelemnt->webelemnt.isEnabled())
						.count()== webElements.size();
		
		boolean res=webElements.stream().allMatch(webelement->webelement.isEnabled());
		
	}
}
