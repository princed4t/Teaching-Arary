package com.programme;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicateusingsset {

	public static void main(String[] args) {
		String st="applwewe";
		StringBuilder sb=new StringBuilder();
		Set<Character>set=new LinkedHashSet<>();
		
		for(int i=0;i<st.length();i++){
			set.add(st.charAt(i));
			
			
		}
		for(char ch:set) {
			sb.append(ch);
		}
		System.out.println(sb);
		
		

	}

}
