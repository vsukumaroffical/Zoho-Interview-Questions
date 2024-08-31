package problems;

import java.util.Scanner;

public class ZigZagConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.nextLine();
		System.out.println("Enter the number of rows");
		int numberOfRows = sc.nextInt();
		System.out.println(convert(str, numberOfRows));
		sc.close();
	}

	private static String convert(String str, int row_end) {
		char ansA[][] = new char[row_end][str.length()];
		int n = str.length();
		int cur = 0, row_start = 0, col_start = 0;
		while (cur < n) {
			while (row_start < row_end && cur < n) {
				ansA[row_start++][col_start] = str.charAt(cur++);
			}
			row_start = Math.max(0, row_start - 2);
			while (row_start > 0 && cur < n) {
				ansA[row_start--][++col_start] = str.charAt(cur++);
			}
			col_start++;
		}
		StringBuilder ans = new StringBuilder();
		for (char arr[] : ansA) {
			for (char c : arr) {
				if (c != '\0') {
					ans.append(c);
				}
			}
		}
		return ans.toString();
	}

}
