package com.convert.example;

public class TwoDigitNumber extends Digit {

	@Override
	String getInWord(int number) {
		String word = "";
		word = ENDINGWITHENTY[number / 10] + onesAndTeen[number % 10];
		return word;
	}

}
