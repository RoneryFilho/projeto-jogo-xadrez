package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
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

		// above
		p.setValues(position.getRow() - 1, position.getCollumns());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// below
		p.setValues(position.getRow() + 1, position.getCollumns());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// left
		p.setValues(position.getRow(), position.getCollumns() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// right
		p.setValues(position.getRow(), position.getCollumns() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// nw
		p.setValues(position.getRow() - 1, position.getCollumns() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// ne
		p.setValues(position.getRow() - 1, position.getCollumns() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		// sw
		p.setValues(position.getRow() + 1, position.getCollumns() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}
		
		// se
		p.setValues(position.getRow() + 1, position.getCollumns() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getCollumns()] = true;
		}

		
		
		return mat;
	}

}
