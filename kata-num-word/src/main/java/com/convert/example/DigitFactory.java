package com.convert.example;

public class DigitFactory {
	public static Digit getInstance(String identifier) {
		Digit digit;
		if (identifier.equals("A")) {
			digit = new InitialDigitNumber();
		} else if (identifier.equals("B")) {
			digit = new TwoDigitNumber();
		}else if (identifier.equals("C")) {
			digit = new ThreeDigitNumber();
		} else {
			digit = new FourDigitNumber();
		}
		return digit;
	}
}
