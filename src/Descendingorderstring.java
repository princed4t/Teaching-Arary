import java.util.Arrays;
import java.util.List;

public class Descendingorderstring {
	public static void main(String[] args) {
		String[] s = { "java", "python", "javascript", "lips" };

		for (int i = 0; i < s.length; i++) {
			String si = s[i];
			for (int j = i + 1; j < s.length; j++) {
				String st = s[j];
				if (si.length() < st.length()) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}

			}

		}

		for (String sop : s) {
			System.out.println(sop);
           
		}

		// List<String> asList = Arrays.asList(s);
		// asList.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(i->System.out.println(i));

	}
}
