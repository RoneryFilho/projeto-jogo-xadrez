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
	
	private void initialPosition() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,7));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,0));
		board.placePiece(new King(board, Color.WHITE), new Position(0,3));
		board.placePiece(new Rook(board, Color.BLACK), new Position(7,7));
		board.placePiece(new Rook(board, Color.BLACK), new Position(7,0));
		board.placePiece(new King(board, Color.BLACK), new Position(7,3));
	}
}
