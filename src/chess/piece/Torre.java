package chess.piece;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Torre extends ChessPiece{

	public Torre(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
