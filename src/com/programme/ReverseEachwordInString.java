package com.programme;

public class ReverseEachwordInString {
	public static void main(String[] args) {
		String s = "java devloper gyu";
		String[] split = s.split(" ");
		
		for (String se : split) {
			String orign="";
			
			
			for (int i = se.length() - 1; i >= 0; i--) {
				

				orign = orign + se.charAt(i);
				

			}
			System.out.print(orign+" ");



		}

	}

}
