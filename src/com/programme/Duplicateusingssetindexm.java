package com.programme;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicateusingssetindexm {

	public static void main(String[] args) {
		String st = "applweweeeeeeeellll";
		List<Character> collect = st.chars().distinct()
		.mapToObj(i->(char)i)
		.collect(Collectors.toList());
		collect.forEach(i->System.out.print(i));
		
		
		
		
		      char[] charArray2 = st.toCharArray();
		      Set<Character> s=new LinkedHashSet();
		      for(char c:charArray2) {
		    	  s.add(c);
		      }
		      String string = s.toString();
		      
		      
		System.out.println(string);
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = st.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ca = charArray[i];
			int indexOf = st.indexOf(ca, i + 1);
			if (indexOf == -1) {

				sb.append(ca);
			}

		}
		System.out.println(sb);

	}

}
