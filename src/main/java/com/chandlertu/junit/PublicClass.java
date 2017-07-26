package com.chandlertu.junit;

public class PublicClass {

	public int publicAdd(int x, int y) {
		return x + y;
	}

	protected int protectedAdd(int x, int y) {
		return x + y;
	}

	int packageAdd(int x, int y) {
		return x + y;
	}

	private int privateAdd(int x, int y) {
		return x + y;
	}

}
