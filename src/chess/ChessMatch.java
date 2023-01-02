package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnearble;
	private ChessPiece promoted;
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialPosition();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCloumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getCloumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialPosition() {
		placeNewPiece('h', 8, new Rook(board, Color.WHITE));
		placeNewPiece('a', 8, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
		placeNewPiece('h', 1, new Rook(board, Color.BLACK));
		placeNewPiece('a', 1, new Rook(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.BLACK));
	}
}
