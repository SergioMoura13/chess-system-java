package application;

import Tabuleiro.Board;
import Tabuleiro.Position;
import Xadrez.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		

	}

}
