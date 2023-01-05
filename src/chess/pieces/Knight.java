package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "N";
	}

	// retorna true se houver uma peça adversária na posição
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// higher right
		p.setValues(position.getRow() - 2, position.getCollumns() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// higher left
		p.setValues(position.getRow() - 2, position.getCollumns() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// high right
		p.setValues(position.getRow() - 1, position.getCollumns() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// high left
		p.setValues(position.getRow() - 1, position.getCollumns() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// low left
		p.setValues(position.getRow() + 1, position.getCollumns() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// low right
		p.setValues(position.getRow() + 1, position.getCollumns() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// lower left
		p.setValues(position.getRow() + 2, position.getCollumns() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// lower right
		p.setValues(position.getRow() +2 , position.getCollumns() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		return mat;
	}

}
