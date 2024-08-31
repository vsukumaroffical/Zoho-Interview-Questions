package problems;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman word");
		String roman = sc.nextLine();
		int num = romanToInt(roman);
		System.out.println("Number is "+num);
		sc.close();

	}

	private static int romanToInt(String roman) {
		int index = 0,n = roman.length();
		int num = 0;
		while(index < n) {
			int val1 = getValue(roman.charAt(index));
			int val2 = (index+1<n)?getValue(roman.charAt(index+1)):0;
			if(val1 < val2) {
				num = num + val2 - val1 ;
				index = index + 2;
			}else {
				num = num + val1;
				index = index + 1;
			}
		}
		return num;
	}
	 private static int getValue(char c){
	        int value = 0;
	        switch(c) {
	            case 'I': value = 1;
	                break;
	            case 'V': value = 5;
	                 break;
	            case 'X': value = 10;
	                break;
	            case 'L': value = 50;
	                break;
	            case 'C': value = 100;  
	                break;
	            case 'D': value = 500;     
	                break;
	            case 'M': value = 1000;           
	                break;
	        }
	        return value;
	    }

}
