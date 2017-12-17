package aspire.training.practice1;

import java.util.Arrays;
import java.util.List;

public class Question1 {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		//You have list of integers
		//1 - Use Stream to print all of them
		//2 - Just print numbers less than 4;
		
		numbers.stream().filter(myNum->myNum<4 )
			.forEach(System.out::println);
		
		
		
		
	}
}
