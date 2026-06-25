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
	void firstMoveShouldOnlyPlaceXInSelectedCell() {
		Tic game = new Tic(3, 3);

		game.play(0, 0);

		assertEquals("X", game.board[0][0]);
		assertEquals("_", game.board[0][1]);
		assertEquals("_", game.board[0][2]);
		assertEquals("_", game.board[1][0]);
		assertEquals("_", game.board[1][1]);
		assertEquals("_", game.board[1][2]);
		assertEquals("_", game.board[2][0]);
		assertEquals("_", game.board[2][1]);
		assertEquals("_", game.board[2][2]);
	}

	@Test
	void firstMoveShouldChangeTurnToO() {
		Tic game = new Tic(3, 3);

		game.play(0, 0);

		assertEquals("O", game.turn);
	}
}
