package com.ultimatetictactoe;

import com.ultimatetictactoe.tictactoe.Board;

import javafx.scene.layout.GridPane;

public class UltimateTicTacToeBoard extends GridPane {

	private final int NUMBER_OF_BOARD = 9;

	private Board[] boards = new Board[NUMBER_OF_BOARD];
	private UltimateTicTacToeGame ultimateTicTacToeGame;
	public int boardCount = 1;

	public UltimateTicTacToeBoard(UltimateTicTacToeGame ultimateTicTacToeGame) {

		this.ultimateTicTacToeGame = ultimateTicTacToeGame;

		for (int i = 0; i < NUMBER_OF_BOARD; ++i) {
			boards[i] = new Board(ultimateTicTacToeGame);
			add(boards[i], i / 3, i % 3);
		}

		setHgap(5);
		setVgap(5);
	}

	public void reset(){

		this.boardCount = 0;
		for(Board board : boards){
			board.reset();
		}
	}
}