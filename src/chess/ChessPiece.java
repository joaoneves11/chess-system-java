package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	

	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board); //o board será criado pelo construtor da super classe (piece)
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
}
