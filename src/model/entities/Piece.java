package model.entities;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Position position, Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
}
