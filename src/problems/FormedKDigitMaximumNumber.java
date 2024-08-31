package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  Given an array of numbers and a number k. Print the maximum possible k digit number which can be 
 *  formed using given numbers.
		INPUT :
		Enter the array size : 4
		Enter the elements : 1 4 973 97
		Enter number of digits : 3
		OUTPUT :
		974
		
		INPUT :
		Enter the array size : 6
		Enter the elements : 1 4 89 73 9 7
		Enter number of digits : 5
		OUTPUT :
		98973//89739
 */
public class FormedKDigitMaximumNumber {

	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<Integer>(Arrays.asList(1, 4, 89, 73, 9, 7));
//		int elements[] = { 1, 4, 973, 97 };
		int digit = 5;
		int max = getKdigitMaximumNumber(elements, digit);
		System.out.println(max);
	}

	private static int getKdigitMaximumNumber(List<Integer> elements, int digit) {
		int currentLength = 0;
		int max = 0;
		String temp = "";
		while (!elements.isEmpty()) {
			temp += getMax(elements);
			if (temp.length() == digit) {
				max = Math.max(max, Integer.parseInt(temp));
				temp = "";
			}
		}
		return max;

	}

	private static String getMax(List<Integer> elements) {
		Integer max = elements.get(0);
		for (Integer n : elements) {
			if (Integer.toString(n).charAt(0) == '9')
				max = n;
			else
				max = Math.max(max, n);
		}
		elements.remove(max);
		return max.toString();
	}

}
