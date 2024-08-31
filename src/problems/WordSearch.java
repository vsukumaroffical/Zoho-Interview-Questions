package problems;

public class WordSearch {

	public static void main(String[] args) {
		char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		System.out.println(exist(board, word));
	}

	public static boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					if (wordSearch(board, word, i, j, 0))
						return true;
				}
			}
		}
		return false;
	}

	private static boolean wordSearch(char[][] board, String word, int row, int col, int index) {
		if (index == word.length())
			return true;
		if (row < 0 || row >= board.length || col < 0 | col >= board[0].length
				|| board[row][col] != word.charAt(index)) {
			return false;
		}
		char temp = board[row][col];
		board[row][col] = '*';

		boolean left = wordSearch(board, word, row, col - 1, index + 1);
		boolean right = wordSearch(board, word, row, col + 1, index + 1);
		boolean top = wordSearch(board, word, row - 1, col, index + 1);
		boolean bottom = wordSearch(board, word, row + 1, col, index + 1);

		if (left || right || top || bottom)
			return true;
		board[row][col] = temp;

		return false;
	}

}
