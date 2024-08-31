package problems;

import java.util.Arrays;

/*
 * Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search
for substring like “too” in the two dimensional string both from left to right and from top to bottom.
						   { 'W', 'E', 'L', 'C', 'O' }, 
						   { 'M', 'E', 'T', 'O', 'Z' },
						   { 'O', 'H', 'O', 'C', 'O' },
						   { 'R', 'P', 'O', 'R', 'A' }, 
						   { 'T', 'I', 'O', 'N', '\0'}
And print the start and ending index as
Start index : <1,2>
End index: <3, 2>
 */
public class SearchSubstringIn2DArray {
	public static void main(String[] args) {
		char array[][] = { { 'W', 'E', 'L', 'C', 'O' }, { 'M', 'E', 'T', 'O', 'Z' }, { 'O', 'H', 'O', 'C', 'O' },
				{ 'R', 'P', 'O', 'R', 'A' }, { 'T', 'I', 'O', 'N', '\0' } };
		String target = "TOO";
		search(array, target);
	}

	private static void search(char[][] array, String target) {
		System.out.println(Arrays.toString(leftToRight(array, target)));
		System.out.println(Arrays.toString(topToBottom(array, target)));
	}

	private static int[] leftToRight(char[][] array, String target) {

		int row = array.length;

		for (int i = 0; i < row; i++) {
			String str = new String(array[i]);
			int index;
			if ((index = str.indexOf(target)) > -1) {
				int ans[] = new int[4];
				ans[0] = i;
				ans[1] = index;
				ans[2] = i;
				ans[3] = index + target.length() - 1;
				return ans;
			}
		}
		return new int[0];
	}

	private static int[] topToBottom(char[][] array, String target) {

		
		int row = array.length;

		for (int i = 0; i < row; i++) {
			int col = array[i].length;
			String str = new String(array[i]);
			for(int j =0;j<col;j++) {
				str +=array[i][j];
			}
			int index;
			if ((index = str.indexOf(target)) > -1) {
				int ans[] = new int[4];
				ans[0] = i;
				ans[1] = index;
				ans[2] = i;
				ans[3] = index + target.length() - 1;
				return ans;
			}
		}
		return new int[0];
	}

}
