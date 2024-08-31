package problems;

import java.util.Scanner;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String title = getExcelTitle(num, new StringBuilder());
		System.out.println("Excel title is "+title);
		sc.close();

	}

	private static String getExcelTitle(int num, StringBuilder answer) {
		if (num == 0) {
			return answer.toString();
		}
		num--;
		int reminder = num % 26;
		char letter = (char) (reminder + 'A');
		answer.insert(0,letter);
		return getExcelTitle(num / 26, answer);

	}

}
