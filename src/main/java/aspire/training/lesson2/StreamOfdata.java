package aspire.training.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfdata {

	private static final String[] DAYS_NAME= new String[] {
			"Friday","Saturday","Sunday","Monday",
			"Tuesday","Wednesday","Thursday"
	};
	
	static List<Integer> days= new ArrayList() {{
		for(int i=0;i<7;i++)
			add(i);
		
	}};
	
	public static void main(String[] args) {
		
			long count =days
			.stream()
			.filter(number->{
				
				return number%2 == 0;})	
			
			.map(number->{
				System.out.println("number: "+number);
				return number;
			})
			.count();
			
			System.out.println("Count: "+count);
	
		
		
		
		
		
		
		
		
		
		
//		List<String> daysName= mapDaysToName(days);
//		daysName= mapToCaps(daysName);
//		forEachPrintIt(daysName);
		
		//List<String> daysName=
				days
			.stream()
			//.parallel()

			//.filter(dayAsInt->dayAsInt<2 || dayAsInt == 0)
			.map(dayAsInt->DAYS_NAME[dayAsInt])
//			.map(dayName->dayName.toUpperCase())
			.map(String::toUpperCase)
			.map(dayName->"Hello "+dayName)
			//.collect(Collectors.toList());
//			.forEach(dayName->System.out.println(dayName));
			.forEach(System.out::println);
				
		
		
//		daysName
//			.forEach(name->System.out.println(name));
//		for (String name : daysName) {
//			System.out.println(name);
//		}
			//.forEach(dayName->System.out.println(dayName));
	}

	private static List<String> mapToCaps(List<String> daysName) {
		
		List<String> resultData = new ArrayList<>();
		
		for(int i=0; i<daysName.size();i++) {
			resultData.add(daysName.get(i).toUpperCase());
		}
		return resultData;
	}

	private static List<String> mapDaysToName(List<Integer> days2) {
		List<String> daysName = new ArrayList<>();
		
		for(int i=0; i<days2.size();i++) {
			daysName.add(DAYS_NAME[days2.get(i)]);
		}
		return daysName;
	}

	private static void forEachPrintIt(List<String> days2) {

		for(int i=0; i< days2.size() ; i++) {
			System.out.println(days2.get(i));
		}
	}
	
}
