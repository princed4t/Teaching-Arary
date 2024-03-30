package com.programme;

import java.util.HashSet;
import java.util.Set;

public class intersectionofanaaray {

	public static void main(String[] args) {
	int []a= {1,2,3,4,5};
	int[]b= {1,2,3,6,7};
	Set<Integer>set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		Set<Integer>finalset=new HashSet<>();
		for(int i:b) {
			if(set.contains(i)) {
				finalset.add(i);
			}
			
		}
     System.out.print(finalset);
		
		
		
	}

}
