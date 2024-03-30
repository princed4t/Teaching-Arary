import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class forpractise {

	public static void main(String[] args) {
		String str = "apple";
		Map<Character, Long> collect = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect);
		List<Character> collect2 = str.chars().mapToObj(i->(char)i).
		sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		collect2.forEach(i->System.out.print(i));
		
		
		
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				Integer in = map.get(c);
				map.put(c, in + 1);
			}

		}
System.out.println(map);
		
		
		
	}

}
