package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 * Classe que representa as peças do xadrez.
 * @author Everton Fernandes
 *
 */
public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
