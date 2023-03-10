package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (row < 1 || row > 8 || column < 'a' || column > 'h') {
			throw new ChessException("Invalid position! Values accepted are only from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	// converte positção de matriz em posição de xadrez
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' + position.getCollumns()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
