package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getCloumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollumns()];
	}
	
	public void placePiece(Piece piece, Position position) {
		this.pieces[position.getRow()][position.getCollumns()] = piece;
		piece.position = position;
	}
}
