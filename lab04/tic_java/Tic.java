package tic;

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;

	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] = "_";
			}
		}
	}

	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Tic)) {
			return false;
		}

		Tic other = (Tic) obj;

		if (rows != other.rows || cols != other.cols || !turn.equals(other.turn)) {
			return false;
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (!board[i][j].equals(other.board[i][j])) {
					return false;
				}
			}
		}

		return true;
	}

	public void play(int row, int col) {
		if (!board[row][col].equals("_")) {
			return;
		}

		board[row][col] = turn;
		switchTurn();
	}

	private void switchTurn() {
		if (turn.equals("X")) {
			turn = "O";
		} else {
			turn = "X";
		}
	}
}
