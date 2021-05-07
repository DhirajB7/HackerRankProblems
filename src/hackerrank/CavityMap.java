package hackerrank;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();

		int[][] matrix = new int[count][count];

		for (int i = 0; i < count; i++) {
			String ip = scan.next();
			for (int j = 0; j < count; j++) {
				matrix[i][j] = Integer.valueOf(String.valueOf(ip.charAt(j)));
			}
		}

		scan.close();

		for (int i = 1; i < count - 1; i++) {
			for (int j = 1; j < count - 1; j++) {
				int value = matrix[i][j];
				if (matrix[i - 1][j] < value && matrix[i + 1][j] < value && matrix[i][j - 1] < value
						&& matrix[i][j + 1] < value) {
					matrix[i][j] = 10;
				}
			}
		}

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(matrix[i][j]==10 ? "X" : matrix[i][j]);
			}
			System.out.println("");
		}

	}

}
