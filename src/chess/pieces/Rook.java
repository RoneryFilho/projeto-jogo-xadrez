package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getCloumns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getCollumns());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setRow(p.getRow() - 1);
		}

		// bellow
		p.setValues(position.getRow() + 1, position.getCollumns());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setRow(p.getRow() + 1);
		}

		// left
		p.setValues(position.getRow(), position.getCollumns() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setCollumns(p.getCollumns() - 1);
		}
		
		// right
		p.setValues(position.getRow(), position.getCollumns() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setCollumns(p.getCollumns() + 1);
		}

		return mat;
	}

}
