import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Striprog {

	public static void main(String[] args) {
		String s = "brrittesh";
		char[] ca = s.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ca.length; i++) {
			char c = ca[i];

			if (!map.containsKey(c)) {
				map.put(c, i);
			} else {
				i = map.get(c);
				map.clear();

			}

		}
		String string = map.keySet().toString();
		System.out.println(string);

	}

}
