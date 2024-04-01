package com.customException;

public class IncurrectPin extends RuntimeException {
	public IncurrectPin(String s) {
		super(s);
	}

}
