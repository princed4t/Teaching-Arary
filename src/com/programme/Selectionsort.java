package com.programme;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a = {22,87,72,54};
	int  min=0;
//duplicate integers are not sorting
		for (int i = 0; i < a.length; i++) {
		  	min =i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i]>a[j]) {
					min = j;
					
				}
				
			}
			
			
				
			}
		
		
		System.out.println(min);
		
		
	}
	
	

		

	
}
