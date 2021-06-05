package matrix.Rotate_Image;

public class Solution_1 {
	public static int[][] rotate(int[][] image) {
		int row_length = image.length;
		int column_length = row_length;

		// Transpose the image
		for (int i = 0; i < row_length; i++) {
			for (int j = i; j < column_length; j++) {
				if (i != j) {
					int temp = image[i][j];
					image[i][j] = image[j][i];
					image[j][i] = temp;
				}
			}
		}

		// Perform Swap
		for (int i = 0; i < row_length; i++) {
			for (int j = 0, k = column_length - 1; j < column_length / 2; j++, k--) {
				int temp = image[i][j];
				image[i][j] = image[i][k];
				image[i][k] = temp;
			}
		}

		return image;
	}

	public static void main(String[] args) {
		int[][] image = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int row_length = image.length;
		int column_length = row_length;
		System.out.println("================Input Image=====================");
		System.out.println();
		for (int i = 0; i < row_length; i++) {
			for (int j = 0; j < column_length; j++) {
				System.out.print(image[i][j] + "\t");
			}
			System.out.println();
		}
		
		image = rotate(image);
		
		System.out.println("================Rotated Image=====================");
		System.out.println();
		for (int i = 0; i < row_length; i++) {
			for (int j = 0; j < column_length; j++) {
				System.out.print(image[i][j] + "\t");
			}
			System.out.println();
		}
	}
}