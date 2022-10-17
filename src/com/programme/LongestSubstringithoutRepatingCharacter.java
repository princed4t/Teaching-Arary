package com.programme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LongestSubstringithoutRepatingCharacter {

	public static void main(String[] args) {
		String str = "aabbcads";

		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		char[] charar = str.toCharArray();

		for (int i = 0; i < charar.length; i++) {
			char ch = charar[i];
			if (!hm.containsKey(ch)) {
				hm.put(ch, i);
			} else {
				i = hm.get(ch);
				hm.clear();
			}

		}
		
		Set<Character> keySet = hm.keySet();
		for(char ch:keySet) {
			System.out.println(ch);
		}

	}

}
