package com.programme;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicateusingssetindexm {

	public static void main(String[] args) {
		String st = "applwewe";
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
