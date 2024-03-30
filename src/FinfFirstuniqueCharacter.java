import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FinfFirstuniqueCharacter {

	public static void main(String[] args) {
		String str = "applea";
		char[] charArray = str.toCharArray();
		List<Character> li = new ArrayList<>();
		for (int i = 0; i < charArray.length; i++) {
			char ch1 = str.charAt(i);
			boolean isunique = true;

			for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if (i != j && ch1 == ch2) {
					isunique = false;
					break;
				}

			}
			if (isunique) {
				li.add(ch1);
			}

		}
		System.out.println(li);
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				Integer integer = map.get(ch[i]);
				map.put(ch[i], integer + 1);

			}

		}
		System.out.println(map);
		
		Set<Character> keySet = map.keySet();
		for(char chw:keySet) {
			if (map.get(chw)==1) {
				System.out.println("first unique occurrence------------->>"+chw);
			
			}
		}

	}

}
