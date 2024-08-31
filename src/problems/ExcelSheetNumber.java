package problems;

import java.util.Scanner;

public class ExcelSheetNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the excel title");
		String title = sc.nextLine();
		int number  = getExcelNumber(title);
		System.out.println("Excel Number is " + number);

	}

	private static int getExcelNumber(String title) {
		int answer = 0 ;
		
		for(int i = 0 ;i < title.length(); i++) {
			int value = title.charAt(i) - 'A' + 1;
			answer = (answer * 26) + value ;
		}
		return answer;
	}

}
