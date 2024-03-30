package com.programme;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicateusingsset {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder();
		String st="applwewe";
		Map<Character, Long> collect = st.chars().mapToObj(i->(char)i)
		.collect(Collectors.groupingBy(i->i,Collectors.counting()));
	List<Character> collect2 = collect.keySet().stream().filter(i->collect.get(i)>1).map(i->i).collect(Collectors.toList());
	collect2.forEach(i->System.out.print(i));
	
	}

}
