package com.programme;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementinArary {

	public static void main(String[] args) {
		int[] a = { 1, 4, 5,4,1,2,1};
		Set<Integer> set=new HashSet<>();
		for (int i = 0; i < a.length-1; i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				set.add(a[i]);
				break;
			}
			
			
		}

		System.out.println(set);	
			
			
		}

	}

}
