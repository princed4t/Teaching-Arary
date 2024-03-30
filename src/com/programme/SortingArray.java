package com.programme;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArray {

	public static void main(String[] args) {
		int[] a = { 10, 30,  6, 9 };
		List<Integer> collect = Arrays.stream(a).mapToObj(i->i)
		.sorted((i1,i2)->i2-i1).collect(Collectors.toList());
		System.out.println(collect);
		
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
