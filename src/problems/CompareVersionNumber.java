package problems;

import java.util.Scanner;

public class CompareVersionNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the version 1");// 1.01.0
		String version1 = sc.nextLine();

		System.out.println("Enter the version 2");
		String version2 = sc.nextLine();

		int ouput = compareVersion(version1, version2);
		System.out.println("Output is " + ouput);
		sc.close();
	}

	private static int compareVersion(String ver1, String ver2) {

		String arr1[] = ver1.split("\\.");
		String arr2[] = ver2.split("\\.");
		int len = arr1.length;
		len = Math.max(len, arr2.length);
		int i;
		for (i = 0; i < len; i++) {
			int n1 = Integer.parseInt(arr1[i]);
			int n2 = Integer.parseInt(arr2[i]);
			if (n1 == n2)
				continue;
			else if (n1 > n2)
				return 1;
			else
				return -1;
		}
		while (i < arr1.length) {
			int n = Integer.parseInt(arr1[i++]);
			if (n != 0)
				return 1;
		}
		while (i < arr2.length) {
			int n = Integer.parseInt(arr2[i++]);
			if (n != 0)
				return -1;
		}
		return 0;
	}

}
