package aspire.training.practice1;

import java.util.Arrays;
import java.util.List;

public class Question2 {

	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList(
				"User Name",
				"PC IP",
				"User Last Name",
				"aspire",
				"Find User By ID");
		//You have list of String
		//1 - Use Stream to print all of them
		//2 - Just print string which contains "User"
		
		listOfStrings.stream()
			.filter(li->li.contains("User")).forEach(System.out::println);
		
		
		
		
	}
}
