import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ibminterview {
	
	
	
	 public static List<String> getJSONDiff(String json1, String json2){
		  Map<String, String> map1 = jsonParse(json1);
		  Map<String, String> map2 = jsonParse(json2);
		  List<String> list=new ArrayList<>();
		  for(String s:map1.keySet()) {
			  if(map2.containsKey(s) && !map1.get(s).equals(map2.get(s))) {
				  list.add(s);
			  }
			  
		  }
		 
		 return list;
	 }
	
	
	
	
	//it take the three step to convert it into map first it takes the help of substring
	//to reduce first and n-1 elementand than it split into comma than it give key value 
	//than traverse it into key value than than split it into : than you find string[]key
	//value than store it into key value pair
	
	
	
	public static Map<String,String> jsonParse( String s1) {
	           String substring = s1.substring(1,s1.length()-1);
	           //System.out.println(substring);
		                    String[] split = substring.split(",");
	
		                       
		                    Map<String, String> map = new TreeMap<>();
		                    for (String pair : split) {
		                        String[] keyValue = pair.split(":");
		                        map.put(keyValue[0], keyValue[1]);
		                    }
		                    return map;
		                    
		                    
		                    
		                    
		
	}
	
	

	public static void main(String[] args) {
		 
		String s1 = "(\"hello\":\"world\",\"hi\":\"hello\",\"you\":\"me\")";
		String s2 = "(\"hello\":\"world\",\"hi\":\"hellooooo\",\"you\":\"me\")";
		System.out.println(getJSONDiff(s1, s2));
	        
		

	}

}
