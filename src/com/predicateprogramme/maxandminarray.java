package com.predicateprogramme;

public class maxandminarray {

	public static void main(String[] args) {
		int [] a= {12,94,45,34,2,4,2,444,4,};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min< a[i]) {
				min=a[i];
				
			}
			
			
			
		}
		System.out.println(min);
	

	

}}
