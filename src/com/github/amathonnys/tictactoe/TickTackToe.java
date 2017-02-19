package com.github.amathonnys.tictactoe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TickTackToe {
	private static final int FRAME_SIZE = 720;

	public static void main(String[] args) {
		BoardSize selectedBoard = (BoardSize) JOptionPane.showInputDialog(new JFrame(), "Choose board size: ",
				"Settings", JOptionPane.INFORMATION_MESSAGE, null, BoardSize.values(), BoardSize.SMALL.toString());

		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setSize(FRAME_SIZE, FRAME_SIZE);
		frame.setResizable(false);
		frame.add(new ButtonsPanel(selectedBoard, FRAME_SIZE, FRAME_SIZE));
		frame.setVisible(true);
	}

}
