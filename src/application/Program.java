package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
	}

}
