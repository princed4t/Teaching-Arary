package com.programme;

import java.util.Scanner;

public class Replaceewithi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String next = sc.next();
		String ne = "";
		for (int i = 0; i < next.length(); i++){
			
			
			if (next.charAt(i) == 'a') {
				ne = ne + 'i';

			}
			else {
				ne=ne+next.charAt(i);
			}

		}
		System.out.println(ne);

	}

}
