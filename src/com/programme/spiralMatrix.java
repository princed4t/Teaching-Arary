package com.programme;

import java.util.Scanner;

public class spiralMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			a[i][j]=sc.nextInt();
			}
		

		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		

		}

		int row = 0;
		int col = 0;
		int endrow = n;
		int endcol = m-1;

		for (int i = 0; i <endrow; i++){
			System.out.print(a[row][i]);
			
			

		}

	}

}
