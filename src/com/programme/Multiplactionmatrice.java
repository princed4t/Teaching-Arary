package com.programme;

public class Multiplactionmatrice {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 1,2,3}, 
				     { 4, 5, 6 },  
				      { 7, 8, 9 }

		};
		int sum = 0;
		int[][] s = new int[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					sum = sum + a[i][k] * b[k][j];
				}

				s[i][j] = sum;
				sum = 0;
			}

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(s[i][j]+" ");
				
			
			}
			System.out.println();
			}
			
		

	}
}
