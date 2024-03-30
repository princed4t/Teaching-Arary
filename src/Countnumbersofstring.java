import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Countnumbersofstring {

	public static void main(String[] args) {
		String str="apple";
		LinkedHashMap<Character, Long> collect3 = str.chars().mapToObj(i->(char)i)
		.collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()));
System.out.println(collect3);
		
		//Set<Integer> keySet = collect3.keySet();
//		for(int k:keySet) {
//			if(collect3.get(k)>1) {
//				System.out.println((char)k+"i love you momita");
//			}
//			
			
			
			
		}
		
		
		
//		
//		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(i->(char)i)
//         .collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()));		
//     List<String> collect2 = collect.keySet().stream()
//     .map(i->{
//    	  if(collect.get(i)>1) {
//    	 return i+"--"+collect.get(i);
//    	  }else {
//    		  return "none";
//    	  }
    	 
//     }).collect(Collectors.toList());
//     
//     System.out.println(collect2);
     
		
		
		
		
	}


