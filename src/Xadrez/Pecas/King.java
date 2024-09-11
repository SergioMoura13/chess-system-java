package Xadrez.Pecas;

import Tabuleiro.Board;
import Xadrez.ChessPiece;
import Xadrez.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K"; 
	}
}
