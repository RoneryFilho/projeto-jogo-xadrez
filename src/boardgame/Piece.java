package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	//mostra os movimentos possiveis da peça
	public abstract boolean[][] possibleMoves();
	
	//mostra no grid as possiveis casas que a peça pode ir
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getCollumns()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
