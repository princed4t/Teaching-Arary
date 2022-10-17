package com.programme;

public class SortingArray {

	public static void main(String[] args) {
		int[] a = { 10, 30,  6, 9 };
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[i] > a[j+1]) {
					int swap = a[i];
					a[i] = a[j+1];
					a[j+1] = swap;
				}

			}

		}
		for (int b : a) {
			System.out.print(b + ",");
		}

	}

}
