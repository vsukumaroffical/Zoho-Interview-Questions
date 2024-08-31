package problems;

public class Practice {
	public static void main(String[] args) {
		int row = 3;
		String str = "12";
		String temp = "";
		int count = 0;
		String res = "";
		System.out.println(str);
		for (int j = 0; j < row; j++) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (temp.isEmpty()) {
					temp += c;
					count++;
				} else if (temp.charAt(0) != c) {
					res += count + temp;
					count = 1;
					temp = "";
					temp+=c;
				} else
					count++;
				if(i==str.length()-1)
					res +=count + temp;
			}
			str = res;
			System.out.println(str);
			res = "";

		}
	}
}
