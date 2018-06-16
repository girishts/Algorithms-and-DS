package com.practice.matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 2 }, { 4, 5, 6, 5 }, { 7, 8, 9, 8 }, { 10, 11, 12, 1 }, { 13, 14, 15, 4 } };
		String printElementsInSpiralOrder = printElementsInSpiralOrder(matrix);
		System.out.println(printElementsInSpiralOrder);
		int [] inputArray = {1,0,3,4,2,1};
		int maxLenSubArray = getMaxLenSubArray(inputArray);
		System.out.println("Max Length:"+maxLenSubArray);
	}

	public static int getMaxLenSubArray(int[] inputArray) {

		int size = 0;
		for (int i = 0; i < inputArray.length; i++) {
			int sum = 0;

			for (int j = i; j < inputArray.length; j++) {
				sum += inputArray[j];
				if (sum == 4) {
					size = Math.max(size, j - i + 1);
				}
			}
		}
		return size;
	}

	public static String printElementsInSpiralOrder(int[][] matrix) {

		int i, k = 0, l = 0;
		int m = matrix.length;

		int n = matrix[0].length;
		String S = "[";
		while (k < m && l < n) {
			for (i = l; i < n; ++i) {

				S = S + String.valueOf(matrix[k][i]) + " ";
			}
			k++;

			for (i = k; i < m; ++i) {
				S = S + String.valueOf(matrix[i][n - 1]) + " ";
			}
			n--;

			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					S = S + String.valueOf(matrix[m - 1][i]) + " ";
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					S = S + String.valueOf(matrix[i][l]) + " ";
				}
				l++;
			}
		}

		// S=S.substring(0,S.length()-1);
		// S=S.concat("]");
		S = S.trim() + "]";
		return S;

	}

}
