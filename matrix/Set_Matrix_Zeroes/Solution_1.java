package matrix.Set_Matrix_Zeroes;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {

	public static int[][] setZeroes(int[][] matrix) {
		// Iterate over the array and find the location of zeros and save it in
		// Arraylist
		List<List<Integer>> list = new ArrayList<>();

		int row_limit = matrix.length;
		int column_limit = matrix[0].length;

		for (int i = 0; i < row_limit; i++) {
			for (int j = 0; j < column_limit; j++) {

				List<Integer> sublist = new ArrayList<>();
				if (matrix[i][j] == 0) {
					sublist.add(i);
					sublist.add(j);
					list.add(sublist);
				}

			}
		}

		// Iterate over the array list, get the indexes
		int list_size = list.size();

		for (int i = 0; i < list_size; i++) {

			int rowIndex = list.get(i).get(0);
			int columnIndex = list.get(i).get(1);

			// use row index, iterate over all the columns in that row and set their value
			// to zero
			for (int column = 0; column < column_limit; column++) {
				matrix[rowIndex][column] = 0;
			}

			// use column index, iterate over all the rows in that column and set their
			// value to zero
			for (int row = 0; row < row_limit; row++) {
				matrix[row][columnIndex] = 0;
			}

		}
		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int row_limit = matrix.length;
		int column_limit = matrix[0].length;
		
		System.out.println("===================Input Matrix======================");
		System.out.println();
		for (int i = 0; i < row_limit; i++) {
			for (int j = 0; j < column_limit; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		matrix = setZeroes(matrix);

		System.out.println("===================Zero Transformed Matrix======================");
		System.out.println();
		for (int i = 0; i < row_limit; i++) {
			for (int j = 0; j < column_limit; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}