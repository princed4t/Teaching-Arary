package com.predicateprogramme;

public class sorting {

	public static void main(String[] args) {
		// bubble sort
		int[] a= {10,20,4,7};
		
		for(int i=0;i<a.length-1;i++) {
			for (int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					
					
				}
				
			}
			
		}
		for(int b:a) {
			System.out.println(b);
		}
				
		

	}

}
