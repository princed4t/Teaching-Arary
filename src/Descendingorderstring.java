import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Descendingorderstring {
	public static void main(String[] args) {
		String[] s = { "java", "python", "javascript", "lips" };
		
	List<String> collect4 = Arrays.stream(s).map(i->i).
	sorted((i1,i2)->i2.compareTo(i1))
	.collect(Collectors.toList());
	collect4.forEach(i->System.out.print(i));	
		
//		
//		
//		for(int i=0;i<s.length-1;i++){
//			
//			
//			for(int j=i+1;j<s.length;j++) {
//				if(s[i].compareTo(s[j])<0) {
//					String temp=s[i];
//					s[i]=s[j];
//					s[j]=temp;
//					
//				}
//				
//			}
//	
//			
//			
//			
//			
//		}
//	for(String t:s) {
//		System.out.println("hello"+t);
//		
//		
//	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		   Stream<String> stream = Arrays.stream(s);
		   List<String> collect = stream.map(i->i).sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
			collect.forEach(i->System.out.print(i));
			
			
			String st="apple";
			
	 LinkedHashMap<Character, Long> collect2 = st.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()));
		 List<String> collect3 = collect2.keySet().stream().map(i->{
		             String string = Character.toString(i);
			return string+"==="+collect2.get(i);
			
			
		}).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		
	 
		String a = "apple";
		char[] charArray = a.toCharArray(); // Convert the string to a character array

		System.out.println(a.length());

		for (int i = 0; i < charArray.length - 1; i++) {
		    for (int j = i + 1; j < charArray.length; j++) {
		        if (charArray[i] < charArray[j]) {
		            char temp = charArray[i];
		            charArray[i] = charArray[j];
		            charArray[j] = temp;
		        }
		    }
		   
		}

		String sortedString = new String(charArray); // Convert the sorted character array back to a string
		System.out.println(sortedString);
		}
	

		/*
		 * for (int i = 0; i < s.length; i++) { String si = s[i]; for (int j = i + 1; j
		 * < s.length; j++) { String st = s[j]; if (si.length() < st.length()) { String
		 * temp = s[i]; s[i] = s[j]; s[j] = temp; }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * for (String sop : s) { System.out.println(sop);
		 * 
		 * }
		 */
	
	
	
	
	

	}

