package com.github.amathonnys.tictactoe;

public enum Player {
	PLAYER_ONE("X","Player One"), PLAYER_TWO("O", "Player Two");
	
	private final String sign;
	private String playerName;
	
	
	private Player(String sign, String playerName){
		this.sign = sign;
		this.playerName = playerName;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getSign() {
		return sign;
	}
}
