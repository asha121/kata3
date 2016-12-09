package com.convert.example;

public class ThreeDigitNumber extends Digit {

	@Override
	String getInWord(int number) {
		String word = "";
		word = onesAndTeen[number / 100] + MAX[0];
		if (number % 100 > 0) {
			word = word + "AND " + new TwoDigitNumber().getInWord(number % 100);
		} else {
			word = word +new TwoDigitNumber().getInWord(number % 100);
		}
		return word;
	}
}
