package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// right-up
		p.setValues(position.getRow() - 1, position.getCollumns() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setValues(p.getRow() - 1,p.getCollumns() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// left up
		p.setValues(position.getRow() - 1, position.getCollumns() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setValues(p.getRow() - 1, p.getCollumns() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// left down
		p.setValues(position.getRow() + 1, position.getCollumns() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setValues(p.getRow() + 1, p.getCollumns() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// right down
		p.setValues(position.getRow() + 1, position.getCollumns() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
			p.setValues(p.getRow() + 1, p.getCollumns() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		return mat;
	}
}
