package com.github.amathonnys.tictactoe;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
	private static final long serialVersionUID = 7469852671559262079L;
	private static final int BUTTON_MARGIN = 5;

	private JButton[][] buttons;
	private Player currentPlayer = Player.PLAYER_ONE;
	private final int row;
	private final int col;

	public ButtonsPanel(BoardSize selectedBoard, int width, int height) {
		this.col = selectedBoard.getSize();
		this.row = selectedBoard.getSize();
		setLayout(new GridLayout(row, col, BUTTON_MARGIN, BUTTON_MARGIN));
		setPreferredSize(new Dimension(width, height));
		initButtons();
	}

	private void initButtons() {
		buttons = new JButton[row][col];
		for (JButton[] buttonArr : buttons) {
			for (JButton button : buttonArr) {
				button = new JButton("");
				button.addActionListener(getPlayerActionListener());
				super.add(button);
			}
		}
	}

	private ActionListener getPlayerActionListener() {
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				if (button.getText() == "") {
					button.setText(currentPlayer.getSign());
					switchPlayer();
				}
			}
		};
	}

	private void switchPlayer() {
		if (currentPlayer.equals(Player.PLAYER_ONE)) {
			currentPlayer = Player.PLAYER_TWO;
		} else {
			currentPlayer = Player.PLAYER_ONE;
		}
		JOptionPane.showMessageDialog(new JFrame(), "It`s player"+ currentPlayer.getSign() +"  turn. " );
	}
	
}
