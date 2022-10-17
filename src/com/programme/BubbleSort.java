package com.programme;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {10,20,4,7};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]){
					int swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
					
				}
		
			}
		for(int ab:a) {
			System.out.print(ab+", ");
		}
		
			
		}
		
		
		
		
		
		
		
	
		

}
