package com.github.amathonnys.tictactoe;

public enum BoardSize {
	
	SMALL(3), MEDIUM(4), LARGE(5);
	
	private final int size;
	
	private BoardSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}
