import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Numberofinteger {

	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 1, 3, 4, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);

			} else {
				Integer key = map.get(a[i]);
				map.put(a[i], key + 1);
			}

		}
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		System.out.println("number os single element whose occurrence is 1---");
		for(int i:keySet) {
			if(map.get(i)==1) {
				System.out.println(i);
			}
			
		}
		
		
		

	}

}
