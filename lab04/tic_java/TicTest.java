package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {
	@Test
	void twoNewBoardsWithSameSizeShouldBeEqual() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3, 3);

		assertEquals(board, board2);
	}

	@Test
	void playingFirstMoveShouldPutXOnBoard() {
		Tic board = new Tic(3, 3);

		board.play(0, 0);

		assertEquals("X", board.board[0][0]);
	}
}
