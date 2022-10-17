package com.predicateprogramme;

import java.util.Arrays;

public class Arrayprogrammebyfunctionalinteraface {

	public static void main(String[] args) {
		ara a1=Arrays::sort;
		
		int[] b= {12,32,56,34,21,32,99};
		a1.test(b);
		
		for(int w:b) {
			System.out.println(w);
		}
		

	

}}
