import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview1 {

	public static void main(String[] args) {

		String text = "Lorem Ipsum is {{simply}} dummy text of the printing and " +
                "typesetting industry. Lorem Ipsum has been the industry's standard " +
                "dummy text ever since the 1500s, when an unknown printer {{took}} " +
                "a galley of type and {{scrambled}} it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into " +
                "electronic {{typesetting}}, remaining essentially {{unchanged}}";

	Map<String,String>map=new HashMap<>();
	map.put("{{simply}}", "##1");
	map.put("{{took}}","##2");
	map.put("{{scrambled}}","##3");
	map.put("{{typesetting}}","##4");
	map.put("{{unchanged}}", "##5");		
		String[] split = text.split(" ");

		Stream<String> stream = Arrays.stream(split);
		String collect = stream.map(word->map.containsKey(word)?map.get(word):word).collect(Collectors.joining(" "));
		
		System.out.println(collect);
	}

}
