package com.convert.example;

public class FourDigitNumber extends Digit {

	@Override
	String getInWord(int number) {
		String word = "";
		word = onesAndTeen[number / 1000] + MAX[1];
		if (number % 1000 > 0) {
			word = word + new ThreeDigitNumber().getInWord(number % 1000);
		} else {
			word = word + new TwoDigitNumber().getInWord(number % 1000);
		}
		return word;
	}
}
