package com.TwoD_Array;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		int a[][] = new int[n][n];
		char dir = 'r';
		int row = 0, col = -1;
		for (int i = 1; i <= n * n; i++) {
			switch (dir) {
			case 'r': {
				col++;
				a[row][col] = i;
				if (col == a.length - 1 || a[row][col + 1] != 0)
					dir = 'd';
			}
				break;
			case 'd': {
				row++;
				a[row][col] = i;
				if (row == a.length - 1 || a[row + 1][col] != 0)
					dir = 'l';
			}
				break;
			case 'l': {
				col--;
				a[row][col] = i;
				if (col == 0 || a[row][col - 1] != 0)
					dir = 'u';
			}
				break;
			case 'u': {
				row--;
				a[row][col] = i;
				if ( a[row - 1][col] != 0)
					dir = 'r';
			}break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
			System.out.print(a[i][j] + "\t");

			System.out.println();
		}
	}

}
