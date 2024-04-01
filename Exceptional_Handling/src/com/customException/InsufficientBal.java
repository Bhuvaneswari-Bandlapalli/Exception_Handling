package com.customException;

public class InsufficientBal extends RuntimeException{
	public InsufficientBal(String d) {
		super(d);
	}

}
