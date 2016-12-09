package com.convert.example;

public abstract class Digit {
	final static String[] onesAndTeen = { "", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ",
			"NINE ", "TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ",
			"EIGHTEEN ", "NINETEEN" };
	final static String[] ENDINGWITHENTY = { "", "", "TWENTY ", "THIRTY ", "FORTY ", "FIFTY ", "SIXTY ", "SEVENTY ",
			"EIGHTY ", "NINETY " };
	String[] maxs = { "HUNDRED ", "THOUSAND " };
	final static String[] MAX = { "HUNDRED ", "THOUSAND " };

	abstract String getInWord(int number);
}