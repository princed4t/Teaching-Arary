package com.predicateprogramme;

public class Pattern {

	public static void main(String[] args) {
		
		char ch='E';
		
		for(int i=1;i<=5;i++) {
		for(int j=5;j>=1;j--) {
			System.out.print(ch);
			ch--;
		}
		//ch='A';
		ch++;
		System.out.println();
		}
		
		

	}

}
