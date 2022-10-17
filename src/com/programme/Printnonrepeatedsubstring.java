package com.programme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Printnonrepeatedsubstring{
	
	public static void main(String[] args) {
		String s="aabs";
		char[] charArray = s.toCharArray();
		Map<Character,Integer> ha=new LinkedHashMap<>();
		for(int i=0;i<charArray.length;i++){
			char ch=charArray[i];
			if(!ha.containsKey(ch)){
				//here i is the index number
				ha.put(ch,i);
				
			}
			else {
				i = ha.get(ch);
				ha.clear();
			}
			
			
			
		}
		
		
			String string = ha.keySet().toString();
			
			System.out.println(string);
		
		
		
		
		
		
		
	}
	

}
